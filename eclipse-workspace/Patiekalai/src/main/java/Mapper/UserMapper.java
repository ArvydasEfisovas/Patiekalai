package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Patiekalas;

public class UserMapper implements RowMapper<Patiekalas> {

	@Override
	public Patiekalas mapRow(ResultSet rs,int rowNum) throws SQLException{
		Patiekalas patiekalas = new Patiekalas();
		patiekalas.setId(rs.getInt("id"));
		patiekalas.setPatiekaloGrupe(rs.getString("patiekalo_grupe"));
		patiekalas.setPatiekaloPavadinimas(rs.getString("patiekalo_pavadinimas"));
		patiekalas.setKalorijuSkaicius(rs.getInt("kaloriju_skaicius"));
		patiekalas.setKaina(rs.getDouble("kaina"));
		return patiekalas;
	}
	
}
	