package com.palani;

import java.util.Vector;

public class VectorClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		System.out.println(v.isEmpty());// true
		System.out.println(v.capacity());// 10
		v.addElement("palani");
		v.addElement("ravi");
		v.addElement("manonmani");
		v.addElement("pandukumar");
		System.out.println(v);//[palani,ravi,manonmani,pandukumar]
		
		System.out.println(v.firstElement());// palani
		System.out.println(v.lastElement());// pandukumar
		
		System.out.println(v.elementAt(0));// palani
		v.removeElement("palani");// will remove only the particular element
		System.out.println(v);
		
		v.removeAllElements();// will clear all the elements
		System.out.println(v);

	}

}
