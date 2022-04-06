import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a plain text: ");
		String txt=scan.nextLine();
		
		System.out.println();
		int key=5;
		int EN,DN;
		String enc= new String("");
		
		char[] alphabets={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<txt.length();i++){
		    
		    EN=(txt.charAt(i)+key-65)%26;
	
		  enc = enc +alphabets[EN] ;
		}
		System.out.println("Encrypted Text: "+enc);
		
		String dnc= new String("");
	    for(int i=0;i<enc.length();i++){
	        
	        DN=(enc.charAt(i)-key-65)%26;
	        
	        dnc=dnc+alphabets[DN];
	        
	    }
	    System.out.println("Decrypted Text: "+dnc);
	}
}
