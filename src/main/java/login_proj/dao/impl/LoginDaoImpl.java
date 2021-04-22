package login_proj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login_proj.dao.LoginDao;
import login_proj.dto.Member;

public class LoginDaoImpl implements LoginDao {
	private static final LoginDaoImpl instance = new LoginDaoImpl();
	private Connection con;
	
	public LoginDaoImpl() {
	}

	public static LoginDaoImpl getInstance() {
		return instance;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	@Override
	public Member selectLoginMember(String id, String passwd) {
		String sql = "select id from users where id = ? and passwd = password(?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getUser(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	private Member getUser(ResultSet rs) throws SQLException {
		String id = rs.getString("id");
		
		return new Member(id);
	}

}
