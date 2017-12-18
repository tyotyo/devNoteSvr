package com.hw.DevNote.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public abstract class GenericDAOImpl<E, K> implements GenericDAO<E, K> {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace =
			"com.hw.DevNote.model.MamberMapper";
	
	@Override
	public K getTime() {
		return sqlSession.selectOne(namespace + ".getNow");
	}
	
	@Override
	public E get(K memID) {
		return sqlSession.selectOne(namespace + ".get", memID);
	}
	
	@Override
	public List<E> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void register(E vo) {
		// TODO Auto-generated method stub
		
	}
}
