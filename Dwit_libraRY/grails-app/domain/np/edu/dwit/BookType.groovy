package np.edu.dwit

class BookType {
    String bookType

    static constraints = {
        bookType blank: false
    }

    String toString(){
        return bookType
    }
}
