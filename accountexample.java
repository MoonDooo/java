package account;
import java.util.Scanner;
public class accountexample {
	private static account[] accountArray = new account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int i = 0;
	public static void main(String[] args) {
		boolean run =true;
		while(run) {
			System.out.println("____________________________________________");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("____________________________________________");
			System.out.print("선택 > ");
			int select = scanner.nextInt();
			
			switch(select) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				 withdraw();
				 break;
			case 5:
				run = false;
			}
		}
		System.out.println("시스템 종료");
	}
	private static void createAccount() {
		String ano;
		String owner;
		int balance;
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("계좌주: ");
		owner = scanner.next();
		System.out.print("초기입금액: ");
		balance = scanner.nextInt();
		accountArray[i] = new account(ano ,owner, balance);
		System.out.println("결과: 계좌가 생성되었습니다.");
		i++;
	}
	private static void accountList() {
		System.out.println("**********");
		System.out.println("계좌 목록");
		System.out.println("**********");
		for(int t = 0; t<i; t++	) {
			System.out.println(accountArray[t].getano() + "   " + accountArray[t].getowner() + "   " + accountArray[t].getbalance());
		}
	}
	private static void deposit() {
		String ano;
		int balance;
		System.out.println("**********");
		System.out.println("예금");
		System.out.println("**********");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("예금액: ");
		balance = scanner.nextInt();
		account ac = find(ano);
		ac.setbalance(ac.getbalance() + balance);
		System.out.println("결과: 예금이 성공하였습니다.");
	}
	private static void withdraw() {
		String ano;
		int balance;
		System.out.println("**********");
		System.out.println("출금");
		System.out.println("**********");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("출금액: ");
		balance = scanner.nextInt();
		account ac = find(ano);
		ac.setbalance(ac.getbalance() - balance);
		System.out.println("결과: 출금이 성공하였습니다.");
	}
	private static account find(String ano) {
		int t =0;
		while(ano == accountArray[t].getano()) {
			t ++;
		}
		return accountArray[t];
	}
}

