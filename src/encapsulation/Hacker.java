package encapsulation;

public class Hacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		//ac.account_number=10;
		ac.setter(10);
		System.out.println(ac.getter());
	}

}
