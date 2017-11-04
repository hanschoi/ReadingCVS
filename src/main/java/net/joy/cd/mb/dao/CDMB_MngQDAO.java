package net.joy.cd.mb.dao ; 

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

 

 
@Repository
public class CDMB_MngQDAO  {
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace =
			"net.joy.card.member.dao.MemberMngQDAO";


	public String getTime() {

		return sqlSession.selectOne(namespace+".getTime");
	}

  
}


