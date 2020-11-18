package com.project;


public class PriceVO 
{
	private double per;
	private int price;
	private String cname;
	private String pformat;
	public String getPformat() 
	{
		return pformat;
	}
	public void setPformat(String pformat)
	{
		this.pformat = pformat;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname) 
	{
		this.cname = cname;
	}
	public double getPer() 
	{
		return per;
	}
	public void setPer(double per) 
	{
		this.per = Math.floor(per*10)/10.0;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
}
