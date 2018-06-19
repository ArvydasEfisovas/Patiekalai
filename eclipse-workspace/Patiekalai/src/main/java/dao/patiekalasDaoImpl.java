package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import Mapper.UserMapper;
import entity.Patiekalas;

public class patiekalasDaoImpl implements patiekalasDao {

	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public patiekalasDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Patiekalas> getAll(){
		String sql = "SELECT * FROM meniu";
		return jdbcTemplate.query(sql, new UserMapper());
	}
	@Override
	public void save(Patiekalas patiekalas) {
		String sql = "INSERT INTO meniu (patiekalo_grupe,patiekalo_pavadinimas,kaloriju_skaicius,kaina) VALUES (?,?,?,?)";
		jdbcTemplate.update(sql,patiekalas.getPatiekaloGrupe(),patiekalas.getPatiekaloPavadinimas(),patiekalas.getKalorijuSkaicius(),patiekalas.getKaina());
	}
	@Override
	public Patiekalas getById(int id) {
		String sql = "SELECT * FROM meniu WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new UserMapper(),id);
	}
	@Override
	public void update(Patiekalas patiekalas) {
		String sql = "UPDATE meniu SET patiekalo_grupe = ?, patiekalo_pavadinimas = ?, kaloriju_skaicius = ?, kaina = ? WHERE id = ?";
		jdbcTemplate.update(sql,patiekalas.getPatiekaloGrupe(),patiekalas.getPatiekaloPavadinimas(),patiekalas.getKalorijuSkaicius(),patiekalas.getKaina(),patiekalas.getId());
	}
	@Override
	public void delete(int id ) {
		String sql = "DELETE FROM meniu WHERE id = ?";
		jdbcTemplate.update(sql,id);
	}
}
