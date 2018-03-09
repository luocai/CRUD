package com.jay.service;

import java.util.List;

import com.jay.entity.Song;

public interface MusicService {
	
	public List<Song> queryAll();
	public Song queryById(int id);
	public void add(Song s);
	public void delete(int id);
	public void update(Song s);
}
