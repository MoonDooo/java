package account;

public class account {
	private String ano;
	private String owner;
	private int balance;
	
	public account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getano() {return ano;}
	public String getowner() {return owner;}
	public int getbalance() {return balance;}
	public void setano(String ano) {this.ano = ano;}
	public void setowner(String owner) {this.owner = owner;}
	public void setbalance(int balance) {this.balance = balance;}

}
