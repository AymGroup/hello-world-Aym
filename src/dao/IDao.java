package dao;

import java.util.List;


public interface IDao<T> {
	boolean insert(T o);
	boolean update(T id);
	boolean delete(Long id);
	T getElement(Long id); //* Retourne un objet selon l'id
	List<T> getElementBy(String ch); //* Retourne une liste des objets selon un critère
	List<T> select(T o);
	List<T> selectAll(); //* Retourne tous les objets
}
