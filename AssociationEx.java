package example2;
 class Driver{
	String driverName;
	public float averageRating;
	public Driver(String driverName, float averageRating) {
		super();
		this.driverName = driverName;
		this.averageRating = averageRating;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public float getAverageRating() {
		return averageRating;
	}
}
	
 class CabServiceProvider  
{
	String cabServiceName;
	int totalCabs;
	
	
	
		public CabServiceProvider( String cabServiceName, int totalCabs) {
		
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
		
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	 void calculateRewardPrice(Driver driver )
	   {
		   double Bonus ;
	  if(cabServiceName.equals("Halo"))
			  {
		  if(driver.averageRating>=4.5&&driver.averageRating<=5) {
			  Bonus = (10*driver.averageRating);
			  System.out.println(+Bonus);
			 // System.out.println(driver.averageRating);
			  
		  }else if (driver.averageRating>=4&&driver.averageRating<4.5) {
			  Bonus = (5*driver.averageRating);
			  System.out.println(+Bonus);
		  }else {
			  Bonus = 0;
			  System.out.println(+Bonus);
		  }
	  }else if(cabServiceName.equals("Aber")) {
		  if(driver.averageRating<=4.5&&driver.averageRating<=5) {
			  Bonus = (8*driver.averageRating);
			  System.out.println(+Bonus);
	  }else if (driver.averageRating>=4&&driver.averageRating<4.5) {
		  Bonus = (3*driver.averageRating);
		  System.out.println(Bonus);
	  }else {
		  Bonus = 0;
		  System.out.println(Bonus);
	  }
	  		
  }

	  
	   }

}

public class AssociationEx {
	public static void main(String[] args)
	{
		
		CabServiceProvider s =new CabServiceProvider("Halo",50);
	Driver k1=new Driver("luke",4.8f);
	Driver k2=new Driver("Mark",4.2f);
	Driver k3=new Driver("David",3.9f);
	
	    //s.calculateRewardPrice(k1);
	    Driver[] driversList = { k1, k2, k3 };
		for (Driver l: driversList) {
			System.out.println("Driver Name: "+l.getDriverName());
			s.calculateRewardPrice(l);
			
		
	}
	}
	}






