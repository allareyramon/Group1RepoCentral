package com.oocl;

import java.util.Scanner;

public class TraingleTest {

	public void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void Downiterate(int x, int y){
		if(x>0) {
			sideIterate(y);
			System.out.println();
			Downiterate(x-1,y+1);	
		}
	}
	
	public void sideIterate(int z){
		if(z>=0) {
		System.out.print("* ");
		sideIterate(z-1);
		}
		else;
	}
	

}
