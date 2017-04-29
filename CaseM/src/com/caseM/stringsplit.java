package com.caseM;

public class stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String allcv = "First Hearing-Wed 10:12-First Hearing";
		String[] cv = allcv.split("-");
		System.out.println(cv[0]);
		System.out.println(cv[1]);
		System.out.println(cv[2]);
		if(cv[0].equalsIgnoreCase(cv[2])){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
