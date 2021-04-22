package login_proj.service;

import java.sql.Connection;

import login_proj.dao.impl.LoginDaoImpl;
import login_proj.ds.JndiDS;
import login_proj.dto.Member;

public class LoginService {
	private LoginDaoImpl dao = LoginDaoImpl.getInstance();
	private Connection con = JndiDS.getConnection();

	public LoginService() {
		dao.setCon(con);
	}

	public Member getUser(String id, String passwd) {
		return dao.selectLoginMember(id, passwd);
	}
	
	
}
