<Query Kind="Program" />

// Binary search approach 
static void Main(string[] args) {
	int[] array1 = new int[] { 1, 3, 5, 7, 9, 10 };
	int[] array2 = new int[] { 1, 2, 3, 4, 7, 15, 20 };
	List<int> intersection = new List<int>();
	
	if (array1.Length < array2.Length) {
		intersection = findIntersection(array1, array2);
	} else {
		intersection = findIntersection(array2, array1);
	}
	
	intersection.ForEach(Console.WriteLine);
}

public static List<int> findIntersection(int[] array1, int[] array2) {
	List<int> intersection = new List<int>();
	for (int i = 0; i < array1.Length; i++) {
		if (search(array2, array1[i]) >= 0){
			intersection.Add(array1[i]);
		}
	}
	return intersection;
}

public static int search(int[] array, int value) {
	int mid;
	int min = 0;
	int max = array.Length - 1;
	while (min <= max) {
		mid = (min + max) / 2;
		if (array[mid] < value) {
			min = mid + 1;
			continue;
		} else if (array[mid] > value) {
			max = mid - 1;
			continue;
		} else {
			return mid;
		}
	}
	return -1;
}
