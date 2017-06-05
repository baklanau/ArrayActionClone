package by.htp.array;

public class MyArray {

	private int addedCount = 0;
	private int[] array;

	public MyArray() {
		this.array = new int[3];
	}

	public void addElement(int element) {
		if (addedCount < array.length) {
			array[addedCount] = element;
			addedCount++;
		} else {
			int[] myArray2 = new int[addedCount * 2];
			System.arraycopy(array, 0, myArray2, 0, addedCount);
			myArray2[addedCount] = element;
			addedCount++;
			array = myArray2;
		}

	}

	public int getAddedCount() {
		return addedCount;
	}

	public void print() {
		for (int n = 0; n < addedCount; n++) {
			System.out.print(array[n] + " ");
		}
		System.out.println();
	}

	public int getElement(int index) {
		return array[index];
	}

	public void sort(boolean fromLessToGreater) {
		for (int i = getAddedCount() - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (returnComparision(j, fromLessToGreater)) {
					int t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}
	}

	private boolean returnComparision(int j, boolean fromLessToGreater) {
		if (fromLessToGreater) {
			return array[j] > array[j + 1];
		} else {
			return array[j] < array[j + 1];
		}
	}

}
