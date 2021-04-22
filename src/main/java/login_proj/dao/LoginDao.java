package login_proj.dao;

import login_proj.dto.Member;

public interface LoginDao {
	Member selectLoginMember(String id, String passwd);
}
