package DS;

public class selectSort {
	//真正的好代码
	public static void sort(int []a) {
		int N = a.length;
		//遍历i:0-n-1, j:i+1-n-1，每轮找到最小的那一个下标min,a[min]和a[i]交换
		for (int i = 0; i < N; i++) {
			int min=i;
			for (int j = i+1; j < N; j++) {
				if (a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
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
