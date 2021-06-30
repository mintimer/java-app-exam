package com.example.demo;

import java.util.Objects;

public class ResponseItem{
	private int albumId;
	private int id;
	private String title;
	private String url;
	private String thumbnailUrl;

	public ResponseItem() {
	}

	public ResponseItem(int albumId, int id, String title, String url, String thumbnailUrl) {
		this.albumId = albumId;
		this.id = id;
		this.title = title;
		this.url = url;
		this.thumbnailUrl = thumbnailUrl;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ResponseItem that = (ResponseItem) o;
		return albumId == that.albumId && id == that.id && Objects.equals(title, that.title) && Objects.equals(url, that.url) && Objects.equals(thumbnailUrl, that.thumbnailUrl);
	}

	public void setAlbumId(int albumId){
		this.albumId = albumId;
	}

	public int getAlbumId(){
		return albumId;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getThumbnailUrl(){
		return thumbnailUrl;
	}
}
