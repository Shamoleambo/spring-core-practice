package com.tidz.core.entities;

public class MaskUser implements Stupid {

	public MaskUser() {
		System.out.println("Supier stupid masks in my pocket ready for use sir! " + getClass().getSimpleName());
	}

	@Override
	public String speak() {
		return "Don't forget your mask!";
	}

}
