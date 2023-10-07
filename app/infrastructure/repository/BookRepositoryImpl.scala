package infrastructure.repository

import domain.model.Book
import domain.service.BookRepository

class BookRepositoryImpl extends BookRepository {
  private var books = Seq.empty[Book]

  def find(id: Long): Option[Book] = books.find(_.id.contains(id))

  def save(book: Book): Book = {
    // ... lógica para salvar o livro na coleção
    book
  }
  // ... outros métodos CRUD
}
