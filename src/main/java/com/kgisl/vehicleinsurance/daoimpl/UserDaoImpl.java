package com.kgisl.vehicleinsurance.daoimpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import com.kgisl.vehicleinsurance.dao.UserDao;
import com.kgisl.vehicleinsurance.model.User;

public class UserDaoImpl implements UserDao

{

	JdbcTemplate jdbcTemplate;

	UserDaoImpl(JdbcTemplate jdbcTemplate) {
		System.out.println("setting jdbctemplate using constructor injection.");
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean add(final User u) {
		String query = "insert into user values(?,?,?,?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, u.getUser_id());
				ps.setString(2, u.getUsername());
				ps.setString(3, u.getEmail());
				ps.setString(4, u.getDob());
				ps.setString(5, u.getPhone_no());
				ps.setString(6, u.getAddress());

				return ps.execute();

			}
		});

	}

	public List<User> getAll()

	{
		return jdbcTemplate.query("select * from user", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User u = new User();
				u.setUser_id(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setDob(rs.getString(4));
				u.setPhone_no(rs.getString(5));
				u.setAddress(rs.getString(6));

				return u;
			}
		});
	}

	public List<User> getById(int user_id)

	{
		return jdbcTemplate.query("select * from user where user_id='" + user_id + "'", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User u = new User();

				u.setUser_id(rs.getInt("user_id"));
				u.setUsername(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setDob(rs.getString("dob"));
				u.setPhone_no(rs.getString("phone_no"));
				u.setAddress(rs.getString("address"));
				return u;

			}
		});

	}

}
