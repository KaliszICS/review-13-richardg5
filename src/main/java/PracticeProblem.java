import java.util.ArrayList;
import java.util.HashMap;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void swap(ArrayList<String> list, int in1, int in2) {
		String temp = list.get(in1);
		list.set(in1, list.get(in2));
		list.set(in2, temp);
	}

	public static ArrayList<Double> createArrayList(double[] arr) {
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}
		return map;
	}

	public static void increaseAge(HashMap<String, Integer> map, String name) {
		map.put(name, map.get(name) + 1);
	}
}
