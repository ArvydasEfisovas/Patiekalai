package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.patiekalasDao;
import entity.Patiekalas;

public class UserServiceImpl implements UserService {

	@Autowired
	public patiekalasDao patiekalasDao;
	
	@Override
	public List<Patiekalas> getAll(){
		return patiekalasDao.getAll();
	}
	
	@Override
	public void save (Patiekalas book) {
		patiekalasDao.save(book);
	}
	
	@Override
	public Patiekalas getById(int id) {
		return patiekalasDao.getById(id);
	}
	
	@Override
	public void update(Patiekalas patiekalas) {	
		patiekalasDao.update(patiekalas);
	}
	@Override
	public void delete(int id ) {
		patiekalasDao.delete(id);
	}
}
