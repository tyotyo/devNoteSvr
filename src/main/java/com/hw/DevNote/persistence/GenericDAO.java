package com.hw.DevNote.persistence;

import java.util.List;

public interface GenericDAO<E, K> {
	public K getTime();
	public void register(E vo);
	public E get(K memID);
	public List<E> getList();
}