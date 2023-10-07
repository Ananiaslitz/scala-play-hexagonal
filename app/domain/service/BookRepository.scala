package domain.service

import domain.model.Book

trait BookRepository {
  def find(id: Long): Option[Book]
  def save(book: Book): Book
  // ... outros métodos CRUD
}
