import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int size = 0, total = 0, i = 0;		
		int minAvg = Integer.MAX_VALUE;
		int maxAvg = Integer.MIN_VALUE;

		//Sample Size
		System.out.print("Please enter the sample size: ");
		size = input.nextInt();

		int[] arr1 = new int [size];
		int[] arr2 = new int [size];
		int[] arr3 = new int [size];
		int[] arr4 = new int [size];

		int[] avg = new int [4];

		//Trials
		System.out.println("Enter numbers for Trial 0 ");	
		for (i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			arr1[i] = input.nextInt();
			total = arr1[i] + total;
		}
		avg [0] = total / size;
		total = 0;

		System.out.println("\nEnter numbers for Trial 1");
		for (i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			arr2[i] = input.nextInt();
			total = arr2[i] + total;
		}
		avg [1] = total / size;
		total = 0;

		System.out.println("\nEnter numbers for Trial 2");
		for (i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			arr3[i] = input.nextInt();
			total = arr3[i] + total;
		}
		avg [2] = total / size;
		total = 0;

		System.out.println("\nEnter numbers for Trial 3");
		for (i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			arr4[i] = input.nextInt();
			total = arr4[i] + total;
		}
		avg [3] = total / size;
		total = 0;

		//Table Header Line
		System.out.println("\n\tSample #\tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4"); 
		for(i = 0; i < size; i++){
			System.out.print("\t" + i);
			System.out.print("\t\t" + arr1[i] + "\t");
			System.out.print("\t" + arr2[i] + "\t");
			System.out.print("\t" + arr3[i] + "\t");
			System.out.println("\t" + arr4[i] + "\t");
		}

		//The Averages
		System.out.println("\t-----------------------------------------------------------------------");
		System.out.println("Average:\t\t" + avg[0]+ "\t\t" + avg[1] + "\t\t" + avg[2] + "\t\t" + avg[3]+ "\t\t");
		for (i = 0; i < 4; i++){
			if(minAvg >= avg[i]){
				minAvg = avg[i];
			}	
			if (maxAvg <= avg[i]){
				maxAvg = avg[i];
			}
		}

		System.out.println("\nMin Average: " + minAvg);
		System.out.println("Max Average: " + maxAvg);

		//Final Statements
		if (minAvg == maxAvg){
			System.out.println("\nThe trials match EXACTLY!");
		}
		else if (maxAvg < minAvg * 2){
			System.out.println("\nThe trials concur with each other!");
		}
		else
			System.out.println("\nThe trials do NOT concur!");		
	}
}

