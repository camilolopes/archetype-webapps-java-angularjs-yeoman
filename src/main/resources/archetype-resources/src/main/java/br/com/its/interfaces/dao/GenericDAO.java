#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package br.com.its.interfaces.dao;

import java.util.List;

public interface GenericDAO<T> {

	void saveOrUpdate(T entity);
	void delete(T entity); 
	List<T> list();
	
}
