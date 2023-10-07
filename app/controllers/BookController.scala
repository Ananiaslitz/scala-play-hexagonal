package controllers

import javax.inject._
import play.api.mvc._
import application.usecase.FindBook
import domain.service.BookRepository

@Singleton
class BookController @Inject()(
  cc: ControllerComponents,
  findBook: FindBook
) extends AbstractController(cc) {
  def getBook(id: Long) = Action { implicit request: Request[AnyContent] =>
    findBook.execute(id) match {
      case Some(book) => Ok(s"Found book: ${book.title}")
      case None       => NotFound("Book not found")
    }
  }
}
