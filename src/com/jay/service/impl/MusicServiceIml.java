package com.jay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.entity.Song;
import com.jay.mapper.SongMapper;
import com.jay.service.MusicService;

@Service
public class MusicServiceIml implements MusicService {
	
	@Autowired
	private SongMapper songMapper;
	
	@Override
	public List<Song> queryAll() {
		
		return songMapper.queryAll();
	}

	@Override
	public Song queryById(int id) {
	
		return songMapper.queryById(id);
	}

	@Override
	public void add(Song s) {
		songMapper.add(s);
	}

	@Override
	public void delete(int id) {
		songMapper.deleteById(id);
	}

	@Override
	public void update(Song s) {
		songMapper.update(s);
	}

}
