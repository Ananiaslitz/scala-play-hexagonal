package application.usecase

import domain.service.BookRepository
import domain.model.Book

class FindBook(bookRepository: BookRepository) {
  def execute(id: Long): Option[Book] = {
    bookRepository.find(id)
  }
}
