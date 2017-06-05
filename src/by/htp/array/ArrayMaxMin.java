package by.htp.array;


public class ArrayMaxMin {

	public static void maximum(MyArray array) {

		int max = array.getElement(0);
		int index = 0;
		int element;
		for (int k = 1; k < array.getAddedCount(); k++) {
			element = array.getElement(k);
			if (element > max) {
				max = element;
				index = k;
			}
		}

		System.out.println(" " + array.getElement(index));
	}

	public static void minimum(MyArray array) {
		int min = array.getElement(0);
		int index = 0;
		int element;
		for (int k = 1; k < array.getAddedCount(); k++) {
			element = array.getElement(k);
			if (element < min) {
				min = element;
				index = k;
			}
		}

		System.out.println(" " + array.getElement(index));
	}

}
