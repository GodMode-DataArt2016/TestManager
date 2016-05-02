package org.GodMode.TestManager.dao;

import java.util.List;

/**
 * Created by ozinoviev on 4/26/2016.
 */
public interface Dao<T, I>
{

    List<T> findAll();

    T find(I id);

    void save(T newsEntry);

    void update(I id);

    void delete(I id);

}