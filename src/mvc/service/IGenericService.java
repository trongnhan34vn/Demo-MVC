package mvc.service;

import java.util.List;

public interface IGenericService<E> {
    void save(E e);
    List<E> findAll();
    E findById(int id);
    void deleteById(int id);
}
