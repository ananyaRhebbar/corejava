package com.tns.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                List<Laptop> laps= new ArrayList<Laptop>();
                laps.add(new Laptop("dell",15,55500));
                laps.add(new Laptop("asus",10,55500));
                laps.add(new Laptop("apple",15,95500));
                Collections.sort(laps);
                for(Laptop l: laps) {
                	System.out.println(l);
                }
	}

}
