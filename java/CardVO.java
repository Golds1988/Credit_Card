package com.project;

public class CardVO 
{
	private String img;
	private String url;
	private String name;
	private Double score;
	public Double getScore() 
	{
		return score;
	}
	public void setScore(Double score) 
	{
		this.score = score;
	}
	public String getImg() 
	{
		return img;
	}
	public void setImg(String img) 
	{
		this.img = img;
	}
	public String getUrl() 
	{
		return url;
	}
	public void setUrl(String url) 
	{
		this.url = url;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String toString() 
	{
		return "CardVO [img=" + img + ", url=" + url + ", name=" + name + ", score=" + score + "]";
	}

}
