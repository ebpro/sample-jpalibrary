package fr.univtln.bruno.samples.jpa;

public interface Repository<E> {

  E save(E entity);


}
