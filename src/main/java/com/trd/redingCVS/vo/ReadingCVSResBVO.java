package com.trd.redingCVS.vo;

import java.sql.Timestamp;

public class ReadingCVSResBVO {
  private int seq ; 
  private Timestamp timestamp ;  
  private int price ; 
  private float size ;
  
public int getSeq() {
	return seq;
}
public void setSeq(int seq) {
	this.seq = seq;
}
public Timestamp getTimestamp() {
	return timestamp;
}
public void setTimestamp(Timestamp timestamp) {
	this.timestamp = timestamp;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public float getSize() {
	return size;
}
public void setSize(float size) {
	this.size = size;
} 
  
  
}
