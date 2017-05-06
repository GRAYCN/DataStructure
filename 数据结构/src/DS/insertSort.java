package DS;

import java.nio.file.attribute.AclEntryPermission;
import java.util.concurrent.Exchanger;

import javax.print.attribute.standard.MediaName;

//
public class insertSort {

	public static void sort(int[] a) {
		int N = a.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
	public static void print(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"   ");
		}
	}
	
	public static void main(String[] args) {
		int []a={3,8,12,15,18,2,5,14};
		sort(a);
		print(a);
	}

}

//
// public class insertSort {
// public static void insertSort(int[] array) {
// if (array == null || array.length < 2) {
// return;
// }
//
// for (int i = 1; i < array.length; i++) {
// int currentValue = array[i];
// int position = i;
// for (int j = i - 1; j >= 0; j--) {
// if (array[j] > currentValue) {
// array[j + 1] = array[j];
// position -= 1;
// } else {
// break;
// }
// }
//
// array[position] = currentValue;
// }
// }
//
// public static void main(String[] args) {
// int[] array = { 3, -1, 0, -8, 2, 1 };
// ArrayUtils.printArray(array);
// insertSort(array);
// ArrayUtils.printArray(array);
// }
// }
//
// class ArrayUtils {
//
// public static void printArray(int[] array) {
// System.out.print("{");
// for (int i = 0; i < array.length; i++) {
// System.out.print(array[i]);
// if (i < array.length - 1) {
// System.out.print(", ");
// }
// }
// System.out.println("}");
// }
// }