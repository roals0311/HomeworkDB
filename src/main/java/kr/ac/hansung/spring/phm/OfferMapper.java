package kr.ac.hansung.spring.phm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OfferMapper implements RowMapper<Offer> {

	public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

		Offer offer = new Offer();

		offer.setYears(rs.getInt("years"));
		offer.setSemester(rs.getInt("semester"));
		offer.setCode(rs.getString("code"));
		offer.setDivision(rs.getString("division"));
		offer.setName(rs.getString("name"));
		offer.setCredit(rs.getInt("credit"));

		return offer;
	}
}
