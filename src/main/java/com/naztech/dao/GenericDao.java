package com.naztech.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDao<T> {
	 boolean save (T value) throws SQLException,ClassNotFoundException;
     boolean update (T value) throws SQLException,ClassNotFoundException;
     boolean delete (T value) throws SQLException,ClassNotFoundException;
     T find (T value) throws SQLException,ClassNotFoundException;
      List<T>getAll() throws SQLException,ClassNotFoundException;

}
