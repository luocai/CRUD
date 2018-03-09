package com.jay.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jay.entity.Song;
import com.jay.mapper.SongMapper;
import com.jay.service.MusicService;


@RunWith(SpringJUnit4ClassRunner.class)
//����junit spring�������ļ�
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
//@ContextConfiguration("classpath:spring-*.xml") //���ַ�ʽ������
public class Test1 {
	@Autowired
	private SongMapper songMapper;
	
	@Autowired
	private MusicService musicService;
	
	@Test
	public void test1(){
		int id = 1;
		List<Song> list = songMapper.queryAll();
		for(Song s : list)
		{
			System.out.println(s);
		}
	}
	
//	@Test
//	public void test2(){
//		Song s = musicService.queryById(1);
//		System.out.println(s);	
//	}
//	
//	@Test
//	public void test3(){
//		Song s = new Song();
//		s.setName("����");
//		s.setTime(2008);
//		s.setAlbum("Ħ����");
//		
//		musicService.add(s);
//	}
//	
//	@Test
//	public void test4(){
//		
//		Song s = new Song();
//		s.setAlbum("�Һ�æ");
//		s.setId(6);
//		s.setName("�໨��");
//		s.setTime(2007);
//		
//		musicService.update(s);
//	}
//	
//	@Test
//	public void test5(){
//		songMapper.deleteById(5);
//	}
}
