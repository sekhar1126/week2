package Assignment2;

public class PassAssignment {

	
	public static boolean checkPasswordValidity(String password) {
		String regex="^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[!@#$%&*_])"+"(?=.*\\S+$).{8,20}$";
		if(password.matches(regex))
		{
			return true;
		}
		return false;
	}


		public static void main(String[] args) {
			
			String password = " ";
			 System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : 
			"invalid!"));
		}

	}



