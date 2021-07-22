package Week3;

public class StringDemo {
	public static void main(String[] args) {
		String str1="Hello";
		String str2=new String("Hello");
		System.out.println(str1.hashCode());//Hashcode of str1
		System.out.println(str2.hashCode());//Hashcode of str2
		System.out.println(str1==str2);//This will print false
		System.out.println(str1.equals(str2));//This will print true
		String str3="Welcome to Java...!";
		System.out.println(str3.substring(3,9));//This statement will print substring of "Welcome to Java...!" from index 3 inclusively to 9 exclusively
		System.out.println(str3.substring(7));//This statement will print the entire string "Welcome to Java...!" from index number 7
		System.out.println(str3.charAt(8));//This statement will print the character at the index number 8 from "Welcome to Java...!"
		System.out.println(str3.indexOf("ava"));//This statement will print the index number of the substring
	}
}

