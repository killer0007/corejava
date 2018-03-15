package encapsulation;

public class Account {
	int account_number;
	private int account_balance;

	public void show() {
		// System.out.println(account_balance);
	}
public int getter() {
	return this.account_balance;
}
public void setter(int num) {
	this.account_balance=num;
}
	public void deposit(int a) {
		if (a < 0) {
			// System.out.println("invalid amount");
		} else {
			account_balance = +a;
		}

	}
}
