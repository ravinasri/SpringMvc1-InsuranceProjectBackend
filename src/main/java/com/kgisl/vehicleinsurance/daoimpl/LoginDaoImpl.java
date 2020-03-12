package com.kgisl.vehicleinsurance.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

import com.kgisl.vehicleinsurance.dao.LoginDao;
import com.kgisl.vehicleinsurance.model.Login;

public class LoginDaoImpl implements LoginDao

{

	JdbcTemplate jdbcTemplate;

	LoginDaoImpl(JdbcTemplate jdbcTemplate) {
		System.out.println("setting jdbctemplate using constructor injection.");
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean add(final Login l) {
		String query = "insert into login values(?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

			
				ps.setString(1, l.getUsername());
				ps.setString(2, l.getPassword());

				return ps.execute();

			}
		});

	}

	public List<Login> getAll(String username,String password)

	{
		return jdbcTemplate.query("select * from login where username='" + username + "'&& password='"+password+"'", new RowMapper<Login>() {
			public Login mapRow(ResultSet rs, int row) throws SQLException {
				Login p = new Login();
             
				p.setUsername(rs.getString("username"));
				p.setPassword(rs.getString("password"));

				return p;
			}
		});
	}

//	public List<Login> getById()
//
//	{
//		return jdbcTemplate.query("select * from login where user_id='" + user_id + "'", new RowMapper<Login>() {
//			public Login mapRow(ResultSet rs, int row) throws SQLException {
//				Login l = new Login();
//              
//				l.setUsername(rs.getString(2));
//				l.setPassword(rs.getString(3));
//
//				return l;
//
//			}
//		});
//
//	}
	
//	public int getAll(Login log) {
//		System.out.println("///////////////");
//		
//		String sql = "select * from login";
//		List<Login> login = jdbcTemplate.query(sql, new RowMapper<Login>()
//				
//				{
//
//					public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
//						Login l = new Login();
//						 l.setUser_id(rs.getInt("user_id"));
//						  l.setUsername(rs.getString("username"));
//						  l.setPassword(rs.getString("password"));
//						return l;
//						
//					}
//			
//				});
//		for(Login logs:login)
//		{
//			System.out.println("for");
//			System.out.println("*********"+log.getUsername());
//			System.out.println("*********"+logs.getUsername());
//			if((log.getUsername().equals(logs.getUsername())) && (log.getPassword().equals(logs.getPassword())))
//			{
//				System.out.println("user"+log.getUsername());
//				System.out.println("pass"+log.getPassword());
//				  a=logs.getUser_id(); 
//				  System.out.println(a);
//				
//				 
//			}
//			
//		}
//		  System.out.println(a+"gfh");
//		return a;
//
//	}

}
