package example2;

class Applicant
{
	private String name;
	private String jobProfile;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobProfile() {
		return jobProfile;
	}
	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class InvalidNameException extends Exception
{
	public InvalidNameException(String message)
	{
		super(message);
	}
}

class InvalidProfileException extends Exception
{
	public InvalidProfileException(String message)
	{
		super(message);
	}
}

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

class Validator
{
	public static boolean ValidateName(String name)
	{
		if(name.equals("") || name==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static boolean ValidateJobProfile(String jobProfile)
	{
		if(jobProfile.equalsIgnoreCase("associate") || jobProfile.equalsIgnoreCase("clerk") || jobProfile.equalsIgnoreCase("executive") || jobProfile.equalsIgnoreCase("officer"))
		{
			return true;
		}
		else
			return false;
	}
	public static boolean ValidateAge(int age)
	{
		if(age>=18 && age <=30)
		{
			return true;
		}
		else
			return false;
	}
	public void Validate(Applicant applicant)throws InvalidNameException, InvalidAgeException,
    InvalidProfileException{
		if (!ValidateName(applicant.getName()))
		{
			throw new InvalidNameException("The name entered should not be empty");
		}
		else if(!ValidateJobProfile(applicant.getJobProfile()))
		{
			throw new InvalidProfileException("The job profile is invalid");
		}
		else if(!ValidateAge(applicant.getAge()))
		{
			throw new InvalidAgeException("Please enter a valid age that is in between 18 and 30");
		}
	}
}

	

public class EXexception {
	public static void main(String[] args) 
	{
		try
		{
			Applicant A=new Applicant();
			A.setName("Jenny");
			A.setAge(25);
			A.setJobProfile("clerk");
			
			Validator V=new Validator();
			V.Validate(A);
			System.out.println("Application Submitted successfully");
		}
		catch(InvalidNameException | InvalidProfileException|InvalidAgeException e )
		{
			System.out.println(e.getMessage());
		}
	}


}
