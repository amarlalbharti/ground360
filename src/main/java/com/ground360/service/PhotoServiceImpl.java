package com.ground360.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ground360.domain.Photo;

public class PhotoServiceImpl implements PhotoService
{
	@Autowired private PhotoService photoService;
	
	public int addPhoto(Photo photo)
	{
		return this.photoService.addPhoto(photo);
	}
	
	public boolean updatePhoto(Photo photo)
	{
		return this.photoService.updatePhoto(photo);
	}
	
	public Photo getPhotoByPid(int pid)
	{
		return this.photoService.getPhotoByPid(pid);
	}
	
	public List<Photo> getPhotoList(int first, int max)
	{
		return this.photoService.getPhotoList(first, max);
	}

}
