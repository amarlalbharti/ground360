package com.ground360.dao;

import java.util.List;

import com.ground360.domain.Photo;

public interface PhotoDao {
	
	public int addPhoto(Photo photo);
	
	public boolean updatePhoto(Photo photo);
	
	public Photo getPhotoByPid(int pid);
	
	public List<Photo> getPhotoList(int first, int max);

}
