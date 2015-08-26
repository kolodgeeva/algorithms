<Query Kind="Program" />

// New better approach
static void Main(string[] args) {
	int[] array1 = new int[] { 1, 3, 5, 7, 9, 10 };
	int[] array2 = new int[] { 1, 2, 3, 4, 7, 15, 20 };
	List<int> intersection = new List<int>();
	intersection = findIntersection(array1, array2);
	intersection.ForEach(Console.WriteLine);
}
public static List<int> findIntersection(int[] array1, int[] array2) {
	List<int> intersection = new List<int>();
	int l1 = array1.Length;
	int l2 = array2.Length;
	int i = 0, j = 0;
	while (i < l1 && j < l2) {
		if (array1[i] > array2[j]) {
			j++;
		} else if (array2[j] > array1[i]) {
			i++;
		} else {
			intersection.Add(array1[i]);
			i++;
			j++;
		}
	}
	return intersection;
}
