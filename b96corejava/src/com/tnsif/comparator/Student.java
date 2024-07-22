package com.tnsif.comparator;

public class Student {
            private int rollNo;
            private String name,address;
			@Override
			public String toString() {
				return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
			}
			public Student() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Student(int rollNo, String name, String address) {
				super();
				this.rollNo = rollNo;
				this.name = name;
				this.address = address;
			}
}
