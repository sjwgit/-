package com.neusoft.model;

import java.io.Serializable;

public class Goods implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer id;
    private String ghs;
    private String address;
	private String upImgFileName;
	private String  goodsDesc;
	private Double  price;
	private Integer nums;
	private String palate;
	private String degree;
	private Double salePrice;
	
	public Goods() {
		super();
	}
	
	
     public Goods(Integer id, String ghs, String address, String upImgFileName, String goodsDesc, Double price,
			Integer nums, String palate, String degree, Double salePrice) {
		super();
		this.id = id;
		this.ghs = ghs;
		this.address = address;
		this.upImgFileName = upImgFileName;
		this.goodsDesc = goodsDesc;
		this.price = price;
		this.nums = nums;
		this.palate = palate;
		this.degree = degree;
		this.salePrice = salePrice;
	}


	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
     public Double getSalePrice() {
		return salePrice;
	}
	public String getPalate() {
		return palate;
	}
   
	public void setPalate(String palate) {
		this.palate = palate;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGhs() {
		return ghs;
	}
	public void setGhs(String ghs) {
		this.ghs = ghs;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUpImgFileName() {
		return upImgFileName;
	}
	public void setUpImgFileName(String upImgFileName) {
		this.upImgFileName = upImgFileName;
	}
	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNums() {
		return nums;
	}
	public void setNums(Integer nums) {
		this.nums = nums;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", ghs=" + ghs + ", address=" + address + ", upImgFileName=" + upImgFileName
				+ ", goodsDesc=" + goodsDesc + ", price=" + price + ", nums=" + nums + ", palate=" + palate
				+ ", degree=" + degree + ", salePrice=" + salePrice + "]";
	}

	
}
