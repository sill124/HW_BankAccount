
/**
 * This program can open multiple accounts, 
 * and print deposits and withdrawals, balances, 
 * and the name of the account owner on each account.
 * 
 * @author Younho An
 * @version v0.1
 * @since 04-24 2022
*/

public class HW_Q4 {

	public static void main(String[] args) {
		
		// 개설할 계좌의 갯수
		int SIZE = 1000;
		BankAccount[] acc = new BankAccount[SIZE];
		
		// 최고 부자와 그의 잔고를 입력받을 변수 선언 및 초기화
		double Max_balance = 0;
		String Super_Rich = null;
		
		// 반복문을 이용해 계좌정보 개설
		for(int i = 0; i<acc.length; i++) {
			
			// 0~50000 사이의 랜덤한 숫자 생성
			double ranbalance = (int)(Math.random()*50000);
			// 고객의 이름 설정
			String name = ("고객" + i);
			
			
			// 개좌 개설 및 고객의 이름과 0~50000사이의 랜덤한 잔고 설정
			acc[i] = new BankAccount();
			acc[i].setOwnerName(name);
			acc[i].setInitialBalance(ranbalance);
			
			// 모든 고객에게 일괄 10000원 지급
			acc[i].addBalance(10000);
			
			// 최고 부자와 그의 잔고금액을 찾아냄
			if(Max_balance < acc[i].getBalance()) {
				Max_balance = acc[i].getBalance();
				Super_Rich = acc[i].getOwnerName();
			}
	
		}
		System.out.println("가장 부자 : "+ Super_Rich);
		System.out.println("그의 잔고 : "+ Max_balance);
	}
}
