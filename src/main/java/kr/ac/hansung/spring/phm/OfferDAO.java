package kr.ac.hansung.spring.phm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class OfferDAO {

	private JdbcTemplate jdbcTemplateObject;
	// private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public Offer getOffer(String semester) {
		String sqlStatement = "select * from offers where semester=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { semester }, new OfferMapper());

	}

	public List<Offer> getOffers() {
		String sqlStatement = "select * from offers";

		return jdbcTemplateObject.query(sqlStatement, new OfferMapper());

	}

	public boolean insert(Offer offer) {

		String code = offer.getCode();
		String division = offer.getDivision();
		String name = offer.getName();

		String sqlStatement = "insert into offers (code, division, name) value (?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { code, division, name }) == 1);
	}

	public boolean update(Offer offer) {
		
		
		int years = offer.getYears();
		int semester = offer.getSemester();
		String code = offer.getCode();
		String division = offer.getDivision();
		String name = offer.getName();
		int credit = offer.getCredit();
		
		String sqlStatement = "update offers years=?, semester=?, code=?, division=?, name=?, credit=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { years, semester, code, division, name, credit }) == 1);
	}

}
