package dao.daoGen;

import java.util.List;

public interface IDaoGen<T> {
	boolean insert(T t);
	boolean update(T t);
	boolean delete(T t);
	List<T> select(T t);
}
