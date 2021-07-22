package Week3;

public class OutOfMemory {
	public static void main(String[] args) {
		String s1="Hi",s2="Hello",s3="Welcome";
		try {
			while(true){
				s1+=s2;
				s2+=s3;
				s3+=s1;
			}
		}
		catch(OutOfMemoryError e) {
			System.out.println(e);
			System.out.println("Out Of Memory error is occured....");
		}
	}
}
