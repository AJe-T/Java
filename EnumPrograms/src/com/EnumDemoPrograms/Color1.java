// Loop through Enum
package com.EnumDemoPrograms;

public enum Color1 {
   RED,
   GREEN,
   WHITE;
}
class Test2{
	public static void main(String[] args) {
	  for(Color var1:Color.values()) {
		  System.out.println(var1);
	  }
	}
}
