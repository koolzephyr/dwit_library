package dwit_library

import grails.plugin.springsecurity.annotation.Secured
import np.edu.dwit.Member
import np.edu.dwit.User


class MemberController {
    def springSecurityService
    def memberService
    @Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
    def index() {
        println(springSecurityService.isLoggedIn())
        if (springSecurityService.isLoggedIn()) {
            def role = springSecurityService.getAuthentication().authorities.toString()
            def currentUser = User.findById(springSecurityService.principal.id)
            println("current user:"+currentUser)
            println("=========="+role.substring(6,9))

            if(role.substring(6,9).equalsIgnoreCase("stu")) {
                redirect(controller:'Member', action:'dashboard')
            }else if(role.substring(6,9).equalsIgnoreCase("adm")){
                println "here = here"
                redirect(controller:'Member', action:'adminDashboard')
            }else if(role.substring(6,9).equalsIgnoreCase("fac")){
                redirect(controller:'Member', action:'facultyDashboard')
            }else if(role.substring(6,9).equalsIgnoreCase("lib")){
                redirect(controller:'Member', action:'librarianDashboard')
            }
        }
        else {
            redirect(controller:'login', action:'index')
        }

    }
    @Secured("ROLE_STUDENT")
    def dashboard() {
        render (view: "dashboard")
    }

    @Secured("ROLE_ADMIN")
    def adminDashboard(){
        println("here")
        render(view: "dashboard")
    }

    @Secured("ROLE_FACULTY")
    def facultyDashboard(){
        render(view: "dashboard")
    }

    @Secured("ROLE_LIBRARIAN")
    def librarianDashboard(){
        render(view: "dashboard")
    }

    @Secured("permitAll")
    def history(){

        def member = Member.findById(params?.id as Long)
        def currentUser = springSecurityService.currentUser
        if(!member.username.equalsIgnoreCase(currentUser.username)){
            flash.message = "Sorry, you're not authorized to view this page."
            redirect(action: 'index')
        }
        [history : memberService.getHistory(member)]
    }
}
