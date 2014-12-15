package com.gos.model;

import java.util.Date;

public class Dvd {

	private Integer id;
	private String name;
	private Integer status;
	private Date createDate;
	private String color;
	private String detail;
	private Float price;
	private String imgIndex;
	
	@Override
	public String toString() {
		return "DVD [id=" + id + ", name=" + name + ", status=" + status
				+ ", createDate=" + createDate + ", color=" + color
				+ ", detail=" + detail + ", price=" + price + ", imgIndex="
				+ imgIndex + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getImgIndex() {
		return imgIndex;
	}

	public void setImgIndex(String imgIndex) {
		this.imgIndex = imgIndex;
	}

}
