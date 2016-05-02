package org.GodMode.TestManager.dao;

import java.util.List;

/**
 * Created by ozinoviev on 4/26/2016.
 */
public interface Dao<T, I>
{

    List<T> findAll();

    T find(I id);

    void saveOrUpdate(T entry);

    void delete(T entry);

}