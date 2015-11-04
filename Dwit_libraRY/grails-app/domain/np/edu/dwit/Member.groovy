package np.edu.dwit

class Member extends User {
    String email
    String contact
    String status

    static constraints = {
    }

    Member(String username, String password) {
        super(username, password)
    }
}
