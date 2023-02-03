package Assignment2;

interface Testable{
	public boolean testcompatability();
	
}

 class mobile {
	 String name;
	 String brand;
	 String operatingsystemname;
	 String operatingsystemversion;
	public mobile(String name, String brand, String operatingsystemname, String operatingsystemversion) {
		super();
		this.name = name;
		this.brand = brand;
		this.operatingsystemname = operatingsystemname;
		this.operatingsystemversion = operatingsystemversion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOperatingsystemname() {
		return operatingsystemname;
	}
	public void setOperatingsystemname(String operatingsystemname) {
		this.operatingsystemname = operatingsystemname;
	}
	public String getOperatingsystemversion() {
		return operatingsystemversion;
	}
	public void setOperatingsystemversion(String operatingsystemversion) {
		this.operatingsystemversion = operatingsystemversion;
	}
	 
 }
 class smartphone extends mobile implements Testable{
		String networkgeneration;
		public smartphone(String name,String brand, String operatingsystemname, String operatingsystemversion,String networkgeneration) {
			super(name,brand,operatingsystemname,operatingsystemversion);
			this. networkgeneration=networkgeneration;
		}
		public String getNetworkgeneration() {
			return networkgeneration;
		}
		public void setNetworkgeneration(String networkgeneration) {
			this.networkgeneration = networkgeneration;
		}
		public boolean testcompatability(){
			if(operatingsystemname.equalsIgnoreCase("saturn")){
				if(networkgeneration.equalsIgnoreCase("3G")) {
					if(operatingsystemversion.equals("1.1")||operatingsystemversion.equals("1.2")||operatingsystemversion.equals("1.3")) {
						return true;
					}else 
						return false;
					
				}else if(networkgeneration.equalsIgnoreCase("4G")) {
					if(operatingsystemversion.equals("1.2")||operatingsystemversion.equals("1.3")) {
						return true;
					}else 
						return false;
					
				}else if(networkgeneration.equalsIgnoreCase("5G")) {
					if(operatingsystemversion.equals("1.3")) {
						return true;
					}else
						return false;
					
				}
				else
					return false;
			}
			else if(operatingsystemname.equalsIgnoreCase("Gara")) {
				if(networkgeneration.equalsIgnoreCase("3G")) {
					if(operatingsystemversion.equalsIgnoreCase("EXRT.1")||operatingsystemversion.equalsIgnoreCase("EXRT.2")||operatingsystemversion.equalsIgnoreCase("EXRU.1")) {
						return true;
					}else 
						return false;
				}else if (networkgeneration.equalsIgnoreCase("4G")) {
					if(operatingsystemversion.equalsIgnoreCase("EXRT.2")||operatingsystemversion.equalsIgnoreCase("EXRU.1")) {
						return true;
					}else 
						return false;
					
				}else if (networkgeneration.equalsIgnoreCase("5G")) {
					if(operatingsystemversion.equalsIgnoreCase("EXRU.1")) {
						return true;
					}else
						return false;
					
				}else
					return false;
				
			}else 
				return false;
			
		}
	}

public class InterfaceEX {
	public static void main(String args[]) {
		smartphone k =new smartphone("FriezaA8","Quasar","Gara","EXRT.1","4G");
		
		if(k.testcompatability()) {
			System.out.println("The mobile OS is compatible with the network generation !");
			
		}else
			System.out.println("The mobile OS is not compatible with the network generation !");
	}

}
