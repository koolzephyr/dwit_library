package dwit_library

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_LIBRARIAN'])
class BookController {

    def bookService
    def report() {

        def booksWithBorrowCount = bookService.booksWithBorrowCount
        [booksWithBorrowCount: booksWithBorrowCount]
    }
}
