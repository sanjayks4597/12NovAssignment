package recursion;

public class PrintReverseString {

	public static int Reverse(String s) {
	    
		int len=s.length();
		if(len<=0) return 0;
		System.out.print(s.charAt(len-1));
		len--;
		
		String y=s.substring(0,len);
		return Reverse(y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Chirag";
		System.out.println(s);
		PrintReverseString.Reverse(s);

	}

}
