package com.isobar.model;

public class Band {
	private String name;
	private String image;
	private String genre;
	private String biography;
	private long numPlays;
	private String id;
	private String[] albums;
	private Object[] albumList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public long getNumPlays() {
		return numPlays;
	}
	public void setNumPlays(long numPlays) {
		this.numPlays = numPlays;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String[] getAlbums() {
		return albums;
	}
	public void setAlbums(String[] albums) {
		this.albums = albums;
	}
	public Object[] getAlbumList() {
		return albumList;
	}
	public void setAlbumList(Object[] albumList) {
		this.albumList = albumList;
	} 
	
	
}
