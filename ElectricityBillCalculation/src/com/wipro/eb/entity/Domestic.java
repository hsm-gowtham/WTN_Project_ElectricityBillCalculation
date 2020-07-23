package com.wipro.eb.entity;

public class Domestic extends Connection{
	public Domestic(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
	public float computeBill()
	{
		int units=currentReading-previousReading;
		float amount=0;
		if(units<=50) {
			
			amount+=(units*2.3);
		}
		else if(units<=100) {
			amount+=(50*2.3);
			units-=50;
			amount+=(units*4.2);
		}
		else if(units>100) {
			amount+=(50*2.3);
			units-=50;
			amount+=(50*4.2);
			units-=50;
			amount+=(units*5.5);
		}
		
		return amount;
	}
}
