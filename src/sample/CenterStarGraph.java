//1791. Find Center of Star Graph

package sample;

public class CenterStarGraph {
	public static void main(String[] args) {
		int s[][] = { { 1, 2 }, { 3, 1}, { 4, 1 } };

		int[] arr = new int[6];

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				int element = s[i][j];
				arr[element]++;
			}
		}

		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}

		System.out.println("The center of the star graph is: " + maxIndex);
	}

}
