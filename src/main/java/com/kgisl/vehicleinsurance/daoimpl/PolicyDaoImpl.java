package com.kgisl.vehicleinsurance.daoimpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import com.kgisl.vehicleinsurance.dao.PolicyDao;
import com.kgisl.vehicleinsurance.model.Policy;
import com.kgisl.vehicleinsurance.model.PolicyPlan;
import com.kgisl.vehicleinsurance.model.PolicyType;

public class PolicyDaoImpl implements PolicyDao

{

	JdbcTemplate jdbcTemplate;

	PolicyDaoImpl(JdbcTemplate jdbcTemplate) {
		System.out.println("setting jdbctemplate using constructor injection.");
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean add(final Policy p) {
		String query = "insert into policy values(?,?,?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, p.getUser_id());
				ps.setString(2, p.getPolicy_type());
				ps.setString(3, p.getPolicy_plan());
				ps.setString(4, p.getStart_date());
				ps.setString(5, p.getEnd_date());

				return ps.execute();

			}
		});

	}

	public List<Policy> getAll()

	{
		return jdbcTemplate.query("select * from policy", new RowMapper<Policy>() {
			public Policy mapRow(ResultSet rs, int row) throws SQLException {
				Policy p = new Policy();
				p.setUser_id(rs.getInt(1));
				p.setPolicy_type(rs.getString(2));
				p.setPolicy_plan(rs.getString(3));
				p.setStart_date(rs.getString(4));
				p.setEnd_date(rs.getString(5));

				return p;
			}
		});
	}

	public List<Policy> getById(int user_id)

	{
		return jdbcTemplate.query("select * from policy where user_id='" + user_id + "'", new RowMapper<Policy>() {
			public Policy mapRow(ResultSet rs, int row) throws SQLException {
				Policy p = new Policy();

				p.setUser_id(rs.getInt(1));
				p.setPolicy_type(rs.getString(2));
				p.setPolicy_plan(rs.getString(3));
				p.setStart_date(rs.getString(4));
				p.setEnd_date(rs.getString(5));

				return p;

			}
		});

	}
	
	
	public List<PolicyType> getType()

	{
		return jdbcTemplate.query("select * from policy_type", new RowMapper<PolicyType>() {
			public PolicyType mapRow(ResultSet rs, int row) throws SQLException {
				PolicyType p = new PolicyType();

				
				p.setPolicy_type(rs.getString("policy_type"));
			
				return p;

			}
		});

	}
	
	public List<PolicyPlan> getPlan()

	{
		return jdbcTemplate.query("select * from policy_plan", new RowMapper<PolicyPlan>() {
			public PolicyPlan mapRow(ResultSet rs, int row) throws SQLException {
				PolicyPlan p = new PolicyPlan();

				
				p.setPolicy_plan(rs.getString("policy_plan"));
			
				return p;

			}
		});

	}
	
	public List<Policy> getAllById(int user_id)

	{
		return jdbcTemplate.query("SELECT u.username,u.email,u.dob,u.phone_no,u.address,v.registration_number,v.chassis_number,v.engine_number,v.registration_place,v.maufacturing_year,v.vehicle_model,v.engine_capacity,v.seating_capacity,v.vehicle_color,p.policy_type,p.policy_plan,p.start_date,p.end_date FROM user u INNER JOIN vehicle v ON u.user_id=v.user_id INNER JOIN policy p ON u.user_id=p.user_id where user_id=1", new RowMapper<Policy>() {
			public Policy mapRow(ResultSet rs, int row) throws SQLException {
				Policy p = new Policy();

				
				p.setName(rs.getString("name"));
				p.setEmail(rs.getString("email"));
				p.setDob(rs.getString("dob"));
				p.setPhone_no(rs.getInt("phone_no"));
				p.setAddress(rs.getString("address"));
				p.setRegistration_number(rs.getInt("registration_number"));
				p.setChassis_number(rs.getInt("chassis_number"));
				p.setEngine_number(rs.getInt("engine_number"));
				p.setRegistration_place(rs.getString("registration_place"));
				p.setManufacturing_year(rs.getString("manufacturing_year"));
				p.setVehicle_model(rs.getString("vehicle_model"));
				p.setEngine_capacity(rs.getString("engine_capacity"));
				p.setSeating_capacity(rs.getInt("seating_capacity"));
				p.setVehicle_color(rs.getString("vehicle_color"));
				p.setPolicy_type(rs.getString("policy_type"));
				p.setPolicy_plan(rs.getString("policy_plan"));
				p.setStart_date(rs.getString("start_date"));
				p.setEnd_date(rs.getString("end_date"));

				return p;

			}
		});

	}

}
