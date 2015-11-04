package np.edu.dwit

class Fine {

    Borrow borrow
    Member member
    short days

    static constraints = {

        borrow nullable: false
        member nullable: false
        days min: 0 as short
    }

    static mapping = {

        version false
    }
}
