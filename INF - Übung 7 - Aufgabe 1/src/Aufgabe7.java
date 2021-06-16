
public class Aufgabe7 {
	
	public static void sort(int[] array, int numberElements) {
		
		for (int i = 0; i < numberElements-1; i++)
            for (int j = 0; j < numberElements-i-1; j++)
                if (array[j] > array[j+1])
                {
                   
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
	
	
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5];

		numbers[0] = 10;
		numbers[1] = 7;
		numbers[2] = 3;
		numbers[3] = 42;
		numbers[4] = 1;
		//int[] numbers = {10, 7, 3, 42, 1};
		
		int noOfItems = numbers.length;
		
		sort(numbers, noOfItems);
		
		for (int i = 0; i < noOfItems; i++) {
			SimpleIO.println(numbers[i]);
			SimpleIO.println("Hallo Test");
		}

	}

}
