package SiteLocation.SiteLocation.services;

import java.util.List;

import javax.ejb.Local;

import SiteLocation.SiteLocation.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
