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
            redirect(controller:'Member', action:'dashboard', params: [id: springSecurityService.principal.id])

        }
        else {
            redirect(controller:'login', action:'index')
        }

    }

    @Secured("permitAll")
    def dashboard() {
        render (view: "dashboard")
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
