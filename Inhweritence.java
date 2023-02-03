package example2;
class camera{
	private String brand;
	private String cost;
	public camera() {
		this.brand="Nikion";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	}
class digitalcamera extends camera{
	private int memory;
	public digitalcamera(String brand,double cost) {
		this.memory=16;
		
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
}


public class Inhweritence {
	public static void main(String[] args) {
		digitalcamera k =new digitalcamera("canon",100);
		System.out.println(k.getBrand()+" " +k.getCost()+" "+k.getMemory());
	}

}
