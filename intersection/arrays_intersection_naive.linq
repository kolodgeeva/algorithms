<Query Kind="Program" />

// Naive approach 
static void Main(string[] args) {
	int[] array1 = new int[] { 1, 3, 5, 7, 9, 10 };
	int[] array2 = new int[] { 1, 2, 3, 4, 7, 15, 20 };
	
	List<int> intersection = new List<int>();
	
	for (int i = 0; i < array1.Length; i++) {
		for (int j = 0; j < array2.Length; j++) {
			if (array1[i] == array2[j]) {
				intersection.Add(array1[i]);
			}
		}		
	}
	
	intersection.ForEach(Console.WriteLine);
}
