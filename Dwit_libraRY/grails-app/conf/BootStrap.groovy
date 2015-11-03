import np.edu.dwit.User
import np.edu.dwit.Role
import np.edu.dwit.UserRole


class BootStrap {

    def init = { servletContext ->
        User admin = new User(username:'admin',password:'admin',enabled:true).save()
        User faculty = new User(username:'faculty',password:'faculty',enabled: true).save()
        User student = new User(username:'student',password:'student',enabled: true).save()
        User librarian = new User(username:'librarian',password:'librarian',enabled: true).save()

        Role role_admin = new Role(authority: 'ROLE_ADMIN').save()
        Role role_faculty = new Role(authority: 'ROLE_FACULTY').save()
        Role role_student = new Role(authority: 'ROLE_STUDENT').save()
        Role role_librarian = new Role(authority: 'ROLE_LIBRARIAN').save()

        UserRole.create(admin,role_admin)
        UserRole.create(faculty,role_faculty)
        UserRole.create(student,role_student)
        UserRole.create(librarian,role_librarian)


    }
    def destroy = {
    }
}
