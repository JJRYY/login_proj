package login_proj.dao;

import java.sql.Connection;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import login_proj.JdbcUtil;
import login_proj.dao.impl.LoginDaoImpl;
import login_proj.dto.Member;

public class LoginDaoTest {
	private static Connection con = JdbcUtil.getConnection();
	private static LoginDaoImpl dao = LoginDaoImpl.getInstance();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao.setCon(con);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test() {
		System.out.println("selectLoginMember");
		String id = "root";
		String passwd = "root";
		Member member = dao.selectLoginMember(id, passwd);
		Assert.assertNotNull(member);
		System.out.println(member);
	}

}
