package com.violetCheese.intermediate;

public class Ex_01_Object_Student {
	
	String name;
	String number;
	int birthYear;
	
	//hashCode 메서드
	//되도록 유일한 값을 반환하도록 하는 게 좋다. 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}//End of hashCode

	//equals 메서드
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex_01_Object_Student other = (Ex_01_Object_Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}//End of equals


	//toString 메서드
	@Override
	public String toString() {
		return "EX_01_Object_Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}//End of toString
	
	
	//main 메서드
	public static void main(String[] args) {
		
		Ex_01_Object_Student s1 = new Ex_01_Object_Student();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		Ex_01_Object_Student s2 = new Ex_01_Object_Student();
		s2.name = "홍길동";
		s2.number = "1234";
		s2.birthYear = 1995;
		
		
		if(s1.equals(s2)) {
			
			System.out.println("s1==s2");
			
		}else {
			
			System.out.println("s1!=s2");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		
	}//End of main
	
}//End of class
