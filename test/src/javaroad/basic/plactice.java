package javaroad.basic;

class plactice {

	  public static void main(String args[]){
		    Television tv1 = new Television();

		    //tv1.dispChannel();
	  }
}

class Television {
	Television(){
		short x = 10;
		double y = 20.25;
		double z = -x + y;  //(1)
		System.out.println(z);  //(2)
	}
}

