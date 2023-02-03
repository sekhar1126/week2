package Assignment2;
class InvalidCouponCodeException extends Exception
{
	public InvalidCouponCodeException(String message)
	{
		super(message);
	}
}
class InvalidDestinationException extends Exception
{
	public InvalidDestinationException(String message)
	{
		super(message);
	}
}
class InvalidTripPackageException extends Exception
{
	public InvalidTripPackageException(String message)
	{
		super(message);
	}
}

class BusBooking
{
	private int bookingid;
	private String destination,tripPackage;
	private double totalAmount;
	
	public BusBooking(int bookingid,String destination,String tripPackage)
	{
		this.bookingid=bookingid;
		this.destination=destination;
		this.tripPackage=tripPackage;
		this.totalAmount=0;
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public String getDesignation() {
		return destination;
	}

	public void setDesignation(String destination) {
		this.destination = destination;
	}

	public String getTripPackage() {
		return tripPackage;
	}

	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	public boolean validateCouponCode(String couponCode,int numOfMembers) throws InvalidCouponCodeException
	{
		if((couponCode.equals("BIGBUS") && numOfMembers>=10)|| (couponCode.equals("MAGICBUS") && numOfMembers>=15))
		{
			return true;
		}
		else throw new InvalidCouponCodeException("Invalid coupon code");
	}
	
	public String bookTrip(String couponCode,int numOfMembers)
	{
		try {
	
		if(!(this.destination.equals("Wasgington DC") || 
			     this.destination.equals("Philadelphia") || 
				 this.destination.equals("Orlando") || 
				 this.destination.equals("Boston") || 
				 this.destination.equals("Atlanta")))
				
				throw new InvalidDestinationException("Invalid Destination");
			
		else if(!(this.tripPackage.equals("Regular") || this.tripPackage.equals("Premium")))
				throw new InvalidTripPackageException("Invalid package");
			
		validateCouponCode(couponCode,numOfMembers);
		if(tripPackage.equals("Regular")) {
			setTotalAmount(500*numOfMembers);
			return "Booking successful";
		}
		else if(tripPackage.equals("Premium")) {
			setTotalAmount(800*numOfMembers);
			return "Booking successful";
		}
		else throw new InvalidTripPackageException("Invalid package");		
	}
	catch(InvalidTripPackageException | InvalidDestinationException | InvalidCouponCodeException e) {
		return e.getMessage();
		}
	
	}
}


public class BUS {
	 public static void main(String[] args) {
		 BusBooking booking = new BusBooking(101,"Orlando", "Regular");
		 String result = booking.bookTrip("MAGICBUS", 15);
		 if(result.equals("Booking successful"))
		 {
		 System.out.println(result);
		 System.out.println("Total amount for the trip: " + booking.getTotalAmount());
		 
		 }
		 else{
			 System.out.println(result);
			 System.out.println("Your booking was not successful, please try again!");
		 }
	 


}
}
