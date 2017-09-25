package com.cognizant.bookmyseat.ticket.vo;

import java.util.Date;

public class PassengerDetailsVO {
	private String name;
	private long phoneNumber;
	private Date doj;
	private String source;
	private String destination;
	private String gender;
	private long cardNumber;
	private int pinNumber;
	private boolean agreed;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the cardNumber
	 */
	public long getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the pinNumber
	 */
	public int getPinNumber() {
		return pinNumber;
	}
	/**
	 * @param pinNumber the pinNumber to set
	 */
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	/**
	 * @return the isAgreed
	 */
	public boolean isAgreed() {
		return agreed;
	}
	/**
	 * @param isAgreed the isAgreed to set
	 */
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	
	
}
