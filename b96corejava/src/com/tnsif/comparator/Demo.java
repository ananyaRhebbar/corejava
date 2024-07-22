package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              ArrayList<Student>ar = new ArrayList<Student>();
              ar.add(new Student(22, "aa","banglore"));
              ar.add(new Student(66, "ee","mysore"));
              ar.add(new Student(33, "bb","hasaan"));
              System.out.println("----------");
              Collections.sort(ar, new SortRoll());
              for(int i=0;i<ar.size();i++)
            	  System.out.println(ar.get(i));
	}

}
