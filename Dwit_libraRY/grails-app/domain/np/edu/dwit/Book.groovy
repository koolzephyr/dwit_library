package np.edu.dwit

class Book {
    String name
    String author
    Integer bookNumber
    Integer availableQuantity
    Integer totalQuantity

    static constraints = {
        name blank: false
        author blank: false
        bookNumber blank: false
        availableQuantity blank: false
        totalQuantity blank: false
    }
    static mapping = {
        version false
    }
}
