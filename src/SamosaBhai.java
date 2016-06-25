import java.util.ArrayList;
import java.util.Scanner;

public class SamosaBhai {

	public SamosaBhai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int testCaseNumbers = scanner.nextInt();
		double numberOfHouses, exponent, firstHouse, nextHouse, beforeHouse, tempVal1, tempVal2, result;
		ArrayList<Integer> tempArrList = new ArrayList<Integer>();
		
		while (testCaseNumbers > 0)	{
			result = 0;
			tempArrList.clear();
			numberOfHouses = scanner.nextInt();
			exponent = scanner.nextInt();
			for(int iterator = 0; iterator < numberOfHouses; iterator++) {
				tempArrList.add(scanner.nextInt());
			}
			
			for(int it = 0; it < tempArrList.size(); it++) {
				firstHouse = tempArrList.get(it);
				for(int iter = (it + 1); iter < tempArrList.size(); iter++) {
					nextHouse = tempArrList.get(iter);
					tempVal1 = Math.abs(firstHouse - nextHouse);
					result = result + Math.pow(tempVal1, exponent);
				}
				
				for(int iter2 = it; iter2 > 0; iter2--) {
					if (iter2 == 0)
						break;
					beforeHouse = tempArrList.get(iter2 - 1);
					tempVal2 = Math.abs(firstHouse - beforeHouse);
					result = result + Math.pow(tempVal2, exponent);
				}
			}
			
			System.out.println(result);
			
			testCaseNumbers--;
		}

	}

}
