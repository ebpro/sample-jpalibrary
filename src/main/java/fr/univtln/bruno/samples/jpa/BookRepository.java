package fr.univtln.bruno.samples.jpa;

import fr.univtln.bruno.samples.jpa.model.documents.Book;
import jakarta.persistence.EntityManager;

import java.util.List;

public class BookRepository implements Repository<Book> {

  private EntityManager em;

  public BookRepository(EntityManager em) {
    this.em = em;
  }

  public Book save(Book book) {
    em.persist(book);
    return book;
  }
  public Book findById(Long id) {
    return em.find(Book.class, id);
  }

  public List<Book> findAll(int pageNumber, int pageSize) {
    return em.createNamedQuery("Book.findAll", Book.class)
      .setFirstResult((pageNumber - 1) * pageSize)
      .setMaxResults(pageSize)
      .getResultList();
  }

  public Book findByTitle(String title) {
    return em.createNamedQuery("Book.findByTitle", Book.class)
             .setParameter("title", title)
             .getSingleResult();
  }


}
