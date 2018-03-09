package com.jay.mapper;

import java.util.List;

import com.jay.entity.Song;

public interface SongMapper {
	
	public Song queryById(int id);
	public List<Song> queryAll();
	public void deleteById(int id);
	public void add (Song s);
	public void update (Song s);
	
}
