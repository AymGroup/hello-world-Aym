package service;

import java.util.List;

public interface IService<T> {
	boolean ajouter(T o);
	boolean modifier(T id);
	boolean supprimer(Long id);
	T getElement(Long id);
	List<T> getElementBy(String ch);
	List<T> lister(T o);
	List<T> listAll();
	
}
