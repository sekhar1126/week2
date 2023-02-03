package Assignment2;
abstract class payment
{
      int custid;
      String paymentid;
      double servicetaxpercentage;
      
       public payment(int custid) {
	      this.custid=custid;
	 
    }
      public int getCustid() {
	    return custid;
    } 
      public void setCustid(int custid) {
	   this.custid = custid;
    }
      public String getPaymentid() {
	     return paymentid;
          }
     public void setPaymentid(String paymentid) {
	   this.paymentid = paymentid;
          }
      public double getServicetaxpercentage() {
	    return servicetaxpercentage;
          }
         public void setServicetaxpercentage(double servicetaxpercentage) {
	         this.servicetaxpercentage = servicetaxpercentage;
        }
          public abstract double payBill(double amount);
        }
class Debitcardpayment extends payment{
    static int counter ;
	double discountpercentage;
    double total;
	static {
		counter=1000;
	}
	public Debitcardpayment(int custid) {
		super(custid);
		setPaymentid("B"+ ++counter);
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Debitcardpayment.counter = counter;
	}
	public double getDiscountpercentage() {
		return discountpercentage;
	}
	public void setDiscountpercentage(double discountpercentage) {
		this.discountpercentage = discountpercentage;
	}
	public double payBill( double amount) {
		if(amount<=500) {
			this.servicetaxpercentage = 2.5;
			this.discountpercentage=1;
		}else if(amount>500&&amount<=1000) {
			this.servicetaxpercentage= 4;
			this.discountpercentage=2;
		}
			else if(amount>1000) {
				this.servicetaxpercentage=5;
				this.discountpercentage=3;
				
				
			}
		this.total =amount+(amount*this.servicetaxpercentage*0.01)-(amount*this.discountpercentage*0.01);

		return this.total;
	}
}
class CreditcardPayment extends payment
{
	static int counter;
	private double servicetax;
	private double total;
	
	static
	{
		counter=1000;
	}
	public CreditcardPayment(int customerid) {
		super(customerid);
		setPaymentid("C"+ ++counter);
	}

	public double payBill(double amount) 
	{
		if(amount<=500)
		{
			this.servicetax=3;
		}
		else if(amount>500 && amount <=1000) {
			this.servicetax=5;
		}
		else if(amount>1000)
		{
			this.servicetax=6;
		}
		this.total=amount+(amount*this.servicetax*0.01);
		return total;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public double getServicetax() {
			return servicetax;
		}
		public void setServicetax(double servicetax) {
			this.servicetax = servicetax;
		}
		
		
}



public class ABstract {
	public static void main(String[] args) 
	{
		Debitcardpayment k = new Debitcardpayment(101);
		 double billAmount=Math.round(k.payBill(500));
		System.out.println("Customer Id: " + k.getCustid());
		System.out.println("Payment Id: " + k.getPaymentid());
		System.out.println("Service tax percentage: " +k.getServicetaxpercentage());
		System.out.println("Discount percentage: " +k.getDiscountpercentage());
		System.out.println("Total bill amount: " + billAmount);
		CreditcardPayment s=new CreditcardPayment(102);
		billAmount = Math.round(s.payBill(1000));
		System.out.println("Customer Id: " + s.getCustid());
		System.out.println("Payment Id: " + s.getPaymentid());
		System.out.println("Service tax percentage: " +s.getServicetax());
		System.out.println("Total bill amount: " + billAmount);
	}
}
