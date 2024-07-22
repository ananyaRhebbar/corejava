package com.tns.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		//	ArrayList ob=new ArrayList();
		//	System.out.println("the size of the array list");
	     //     ob.add(2);
	       //   ob.add(22.35);
	     //     ob.add('a');
	     //     System.out.println("the ele of array are"+ob);
	     //     System.out.println("cheack the element is there or not"+ob.contains(22.35));
	     //     System.out.println("remove the specified ele from the list"+ob.remove(0));
	     //     System.out.println("the ele of array are"+ob);
	          ArrayList <String>ob = new ArrayList<String>();
	          ob.add("banglore");
	          ob.add("mysore");
	            ob.add("hubli");
	            System.out.println("ele of array array"+ob);
	            Collections.sort(ob);
	            System.out.println("ele of array array"+ob);
	            
	            Iterator<String>  i= ob.iterator();
	            while(i.hasNext());
	            String nm=i.next();
	            i.remove();
	            System.out.println("nm");
		}

	}



