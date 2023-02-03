package Assignment2;

public class webAssignment {
  public static boolean checkwebvalidity(String webaddress) {
	   String regex="(http://|https://)(www\\.).*[a-zA-Z0-9]*(.com|.org|.net)";
	   if(webaddress.matches(regex)) {
		   return true;
	   }
	   return false;
  }
	
	public static void main(String[] args) {
		
		String webaddress= "http://www.company.com";
		System.out.println("The web address is "+ (checkwebvalidity(webaddress) ? "valid!" : 
				"invalid!"));
	}

}
