//1672. Richest Customer Wealth

package sample;

public class RichestCustomerWealth {

	public static int findRichestCustomerWealth(int[][] accounts) {
		int maxWealth = 0;

		for (int i = 0; i < accounts.length; i++) {
			int currentWealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				currentWealth = currentWealth+accounts[i][j];
			}
			maxWealth = Math.max(maxWealth, currentWealth);
		}

		return maxWealth;
	}

	public static void main(String[] args) {
		int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 }, { 4, 5, 6 }};

		int maxWealth = findRichestCustomerWealth(accounts);
		System.out.println("The richest customer's wealth is: " + maxWealth);
	}
}