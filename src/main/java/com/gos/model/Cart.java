package com.gos.model;

public class Cart {

	private Integer id;
	private User user;
	private Dvd dvd;
	private Integer buynum;
	private Float itemprice; // 本项小计
	private Integer status;
	
	@Override
	public String toString() {
		return "Cart [id=" + id + ", user=" + user + ", dvd=" + dvd
				+ ", buynum=" + buynum + ", itemprice=" + itemprice + "]";
	}

	public Cart() {
	}
	
	public Cart(User user, Dvd dvd, Integer buynum,
			Float itemprice, Integer status) {
		this.user = user;
		this.dvd = dvd;
		this.buynum = buynum;
		this.itemprice = itemprice;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Dvd getDvd() {
		return dvd;
	}
	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

	public Integer getBuynum() {
		return buynum;
	}
	public void setBuynum(Integer buynum) {
		this.buynum = buynum;
	}
	public Float getItemprice() {
		return itemprice;
	}
	public void setItemprice(Float itemprice) {
		this.itemprice = itemprice;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
