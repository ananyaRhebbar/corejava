package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortRoll {
	
	public static void main(String[] args) {
		
		ArrayList<Student>ar= new ArrayList<Student>  ()
				ar.add(new Student(222,"aaa","london"));
		        ar.add(new Student(242,"bbb","usa"));
		    	ar.add(new Student(232,"ccc","paris"));
		    	
		    	System.out.println("-----------");
		    	Collections.sort(ar,new SortRoll());
		         
	}

}
