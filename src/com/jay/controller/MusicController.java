package com.jay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jay.entity.Song;
import com.jay.service.MusicService;

@Controller
@RequestMapping("")
public class MusicController {
	
	@Autowired
	private MusicService musicService ;
	
	@RequestMapping("queryAll")
	public ModelAndView queryAll()
	{
		ModelAndView mav = new ModelAndView();
		List<Song> list= musicService.queryAll();
		
		mav.addObject("list",list);
		mav.setViewName("queryAll");
		
		return mav;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("name")String name,@RequestParam("album") String album, @RequestParam("time")String time)
	{
		
//		ModelAndView miv = new ModelAndView();
//		miv.setViewName("queryAll");  //必须跳转到/queryAll而不是queryAll.jsp
		
		Song s = new Song();
		s.setName(name);
		s.setAlbum(album);
		s.setTime(Integer.valueOf(time));
		
		musicService.add(s);
		
//		return "queryAll"; 为啥不行呢
//		return "redirect:/queryAll";
		
		return new ModelAndView("redirect:/queryAll"); //nice
	}
	
	@RequestMapping("toAdd")
	public ModelAndView toAdd()
	{
		ModelAndView mlv = new ModelAndView();
		mlv.setViewName("add");
		return mlv;
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(Song song)
	{
//System.out.println(song);
		Song s = musicService.queryById(song.getId()); //测试
//System.out.println("要删除的对象是"+ s );
		musicService.delete(s.getId());
		
		return new ModelAndView("redirect:/queryAll");
	}
	
	@RequestMapping("toEdit")
	public ModelAndView toEdit(int id)
	{
		
//System.out.print("id是:" + id);
//System.out.println(song);
		Song s = musicService.queryById(id);
		ModelAndView mlv = new ModelAndView("edit");
		mlv.addObject("song",s);
//		mlv.setViewName("edit");
		
		return mlv;
	}
	
	@RequestMapping(value = "edit")
	public ModelAndView update(Song s) // 可以这样写吗
	{
System.out.println(s);
		musicService.update(s);
		
		return new ModelAndView("redirect:/queryAll");
	}
}
