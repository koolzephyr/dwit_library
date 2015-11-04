package np.edu.dwit

class Book {
    String name
    String author
    Integer bookNumber

    static constraints = {
        name blank: false
        author blank: false
        bookNumber blank: false
    }
    static mapping = {
        version false
    }
}
