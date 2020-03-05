package com.kgisl.vehicleinsurance.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import com.kgisl.vehicleinsurance.dao.VehicleDao;
import com.kgisl.vehicleinsurance.model.EngineCapacity;
import com.kgisl.vehicleinsurance.model.ManufacturingYear;
import com.kgisl.vehicleinsurance.model.RegistrationPlace;
import com.kgisl.vehicleinsurance.model.SeatingCapacity;
import com.kgisl.vehicleinsurance.model.Vehicle;
import com.kgisl.vehicleinsurance.model.VehicleColor;
import com.kgisl.vehicleinsurance.model.VehicleModel;

public class VehicleDaoImpl implements VehicleDao

{
	JdbcTemplate jdbcTemplate;

	VehicleDaoImpl(JdbcTemplate jdbcTemplate) {
		System.out.println("setting jdbctemplate using constructor injection.");
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean add(final Vehicle v) {
		String query = "insert into vehicle values(?,?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, v.getUser_id());
				ps.setString(2, v.getRegistration_number());
				ps.setString(3, v.getChassis_number());
				ps.setString(4, v.getEngine_number());
				ps.setString(5, v.getRegistration_place());
				ps.setString(6, v.getManufacturing_year());
				ps.setString(7, v.getVehicle_model());
				ps.setString(8, v.getEngine_capacity());
				ps.setString(9, v.getSeating_capacity());
				ps.setString(10, v.getVehicle_color());

				return ps.execute();

			}
		});

	}

	public List<Vehicle> getAll()

	{
		return jdbcTemplate.query("select * from vehicle", new RowMapper<Vehicle>() {
			public Vehicle mapRow(ResultSet rs, int row) throws SQLException {
				Vehicle v = new Vehicle();
				v.setUser_id(rs.getInt(1));
				v.setRegistration_number(rs.getString(2));
				v.setChassis_number(rs.getString(3));
				v.setEngine_number(rs.getString(4));
				v.setRegistration_place(rs.getString(5));
				v.setManufacturing_year(rs.getString(6));
				v.setVehicle_model(rs.getString(7));

				v.setEngine_capacity(rs.getString(8));
				v.setSeating_capacity(rs.getString(9));

				v.setVehicle_color(rs.getString(10));

				return v;
			}
		});
	}

	public List<Vehicle> getById(int user_id)

	{
		return jdbcTemplate.query("select * from vehicle where user_id='" + user_id + "'", new RowMapper<Vehicle>() {
			public Vehicle mapRow(ResultSet rs, int row) throws SQLException {

				Vehicle v = new Vehicle();

				v.setUser_id(rs.getInt(1));
				v.setRegistration_number(rs.getString(2));
				v.setChassis_number(rs.getString(3));
				v.setEngine_number(rs.getString(4));
				v.setRegistration_place(rs.getString(5));
				v.setManufacturing_year(rs.getString(6));
				v.setVehicle_model(rs.getString(7));
				v.setEngine_capacity(rs.getString(8));
				v.setSeating_capacity(rs.getString(9));
				v.setVehicle_color(rs.getString(10));

				return v;

			}
		});

	}
	
	public List<RegistrationPlace> getPlace()

	{
		return jdbcTemplate.query("select * from registration_place", new RowMapper<RegistrationPlace>() {
			public RegistrationPlace mapRow(ResultSet rs, int row) throws SQLException {
				RegistrationPlace r = new RegistrationPlace();
			
				
				r.setRegistration_place(rs.getString("registration_place"));

			

				return r;
			}
		});
	}
	public List<VehicleModel> getModels()

	{
		return jdbcTemplate.query("select * from vehicle_model", new RowMapper<VehicleModel>() {
			public VehicleModel mapRow(ResultSet rs, int row) throws SQLException {
				VehicleModel v = new VehicleModel();
			
				
				v.setVehicle_model(rs.getString("vehicle_model"));

			

				return v;
			}
		});
	}
	
	public List<VehicleColor> getColors()

	{
		return jdbcTemplate.query("select * from vehicle_color", new RowMapper<VehicleColor>() {
			public VehicleColor mapRow(ResultSet rs, int row) throws SQLException {
				VehicleColor v = new VehicleColor();
			
				
				v.setVehicle_color(rs.getString("vehicle_color"));

			

				return v;
			}
		});
	}
	
	public List<SeatingCapacity> getSeatCapacity()

	{
		return jdbcTemplate.query("select * from seating_capacity", new RowMapper<SeatingCapacity>() {
			public SeatingCapacity mapRow(ResultSet rs, int row) throws SQLException {
				SeatingCapacity s = new SeatingCapacity();
				s.setSeating_capacity(rs.getString("seating_capacity"));
				return s;
			}
		});
	}
	
	
	public List<ManufacturingYear> getYear()

	{
		return jdbcTemplate.query("select * from manufacturing_year", new RowMapper<ManufacturingYear>() {
			public ManufacturingYear mapRow(ResultSet rs, int row) throws SQLException {
				ManufacturingYear m = new ManufacturingYear();
				m.setManufacturing_year(rs.getInt("manufacturing_year"));
				return m;
			}
		});
	}
	

	public List<EngineCapacity> getCC()

	{
		return jdbcTemplate.query("select * from engine_capacity", new RowMapper<EngineCapacity>() {
			public EngineCapacity mapRow(ResultSet rs, int row) throws SQLException {
				EngineCapacity e = new EngineCapacity();
				e.setEngine_capacity(rs.getString("engine_capacity"));
				return e;
			}
		});
	}
	


}
