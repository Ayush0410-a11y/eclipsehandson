class Bank{
	double rateofInterest = 7.8;
}

class HDFC extends Bank{
	void interestAmount(double amount) {
		double interestAmount = (amount * rateofInterest)/100;
		System.out.println(interestAmount);
	}
}



public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc = new HDFC();
		hdfc.interestAmount(100000);
	}

}
