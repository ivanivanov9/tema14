package tema14;

public class SortingPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50000;
		int[]arrB = new int[n];
		int[]arrS = new int[n];
		int[]arrM = new int[n];
		int[]arrQ = new int[n];
		for(int i = 0; i < n; i++) {
			int element = (int)(Math.random() * 1000);
			arrB[i] = element;
			arrS[i] = element;
			arrM[i] = element;
			arrQ[i] = element;
		}
		
		long timeB = 0, timeS = 0, timeM = 0, timeQ = 0;
		long currentTime = System.currentTimeMillis();
		
		BubbleSort.bubbleSort(arrB);
		timeB = System.currentTimeMillis() - currentTime;
		currentTime = System.currentTimeMillis();
		
		SelectionSort.selectionSort(arrS);
		timeS = System.currentTimeMillis() - currentTime;
		currentTime = System.currentTimeMillis();
		
		MergeSort.mergeSort(arrM);
		timeM = System.currentTimeMillis() - currentTime;
		currentTime = System.currentTimeMillis();
		
		QuickSort.quickSort(arrQ);
		timeQ = System.currentTimeMillis() - currentTime;
		currentTime = System.currentTimeMillis();
		
		String formatHeader = "%-12s%-8s%-10s%-7s%-7s%n";
		String formatTimeData = "%,-12d%-8d%-10d%-7d%-7d%n";
		System.out.printf(formatHeader, "Array size", "Bubble", "Selection", "Merge", "Quick");
		System.out.printf(formatTimeData, n, timeB, timeS, timeM, timeQ);




	}

}
