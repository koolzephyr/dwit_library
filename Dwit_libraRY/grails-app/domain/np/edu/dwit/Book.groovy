package np.edu.dwit

class Book {
    String name
    String author
    Integer bookNumber
    Integer availableQuantity
    Integer totalQuantity
    BookType bookType

    static constraints = {
        name blank: false, nullable: false
        author blank: false, nullable: false
        bookNumber nullable: false
        availableQuantity nullable: false
        totalQuantity nullable: false
        bookType nullable: false
    }
    static mapping = {
        version false
    }
}
