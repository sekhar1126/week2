package example2;

class bill{
	public static int counter;
	String billid;
	String paymentmode;
	static {
		counter=9000;
	}
	bill(String paymentmode){
		this.paymentmode=paymentmode;
		this.billid="B"+ ++counter;
		
	}
	public String getBillid() {
		return billid;
	}
	public void setBillid(String billid) {
		this.billid = billid;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	
	
}
public class Tester {
	public static void main(String[] args) {
		 bill bill1 = new bill("DebitCard");
		 bill bill2 = new bill("PayPal");
		 bill bill3=new bill("cash");
		 
		 bill[] bills = { bill1, bill2,bill3 };
		 
		 for (bill bill : bills) {
		 System.out.println("Bill Details");
		 System.out.println("Bill Id: " + bill.getBillid());
		 System.out.println("Payment method: " + bill.getPaymentmode());
		 System.out.println();
		 }
		 }


}
