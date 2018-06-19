package dao;

import java.util.List;

import entity.Patiekalas;



public interface patiekalasDao {

	List<Patiekalas> getAll();
	
	void save (Patiekalas patiekalas);
	
	Patiekalas getById(int id);
	
	void update(Patiekalas patiekalas);
	
	void delete( int id);
}
