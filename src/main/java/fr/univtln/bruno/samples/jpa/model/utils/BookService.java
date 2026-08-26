package fr.univtln.bruno.samples.jpa.model.utils;

import fr.univtln.bruno.samples.jpa.BookRepository;
import fr.univtln.bruno.samples.jpa.model.documents.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class BookService {

  private final EntityManager em;
  private final BookRepository bookRepository;
  private final AuthorRepository authorRepository;

  public BookService() {

    this.em = EntityManagerFactory.get......
    this.bookRepository = new BookRepository(em);
  }

  public List<Book> findAll(int page, int size) {
    return bookRepository.findAll(page, size);
  }

  public boolean checkRepair(Book book) {
    return ....; METTRE ICI LE CODE QUI ESTIME AVEC DU ML SI UN LIVRE EST EN BON ETART EN FONCTION DE SON AGE ET DES EMPRUNTS QU'IL A SUBI
  }

}
