package com.wipro.eb.entity;

public class Commercial extends Connection{
	public Commercial(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
	public float computeBill()
	{
		int units=currentReading-previousReading;
		float amount=0;
		if(units<=50) {
			
			amount+=(units*5.2);
		}
		else if(units<=100) {
			amount+=(50*5.2);
			units-=50;
			amount+=(units*6.8);
		}
		else if(units>100) {
			amount+=(50*5.2);
			units-=50;
			amount+=(50*6.8);
			units-=50;
			amount+=(units*8.3);
		}
		
		return amount;
	}
}
