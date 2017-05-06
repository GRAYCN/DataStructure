package DS;

import javax.print.attribute.standard.MediaName;

public class quickSort {
	
	public static void sort(int[] a) {
		sort(a,0,a.length-1);
	}
	

	
	private static void sort(int[] a, int lo, int hi) {
		if(hi<=lo)	return;
		int j = partition(a,lo,hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}



	private static int partition(int[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		
		int i=lo,j=hi+1;
		int v=a[lo];
		while (true) {
			while(a[++i]<v) if(i==hi) break;
			while(v<a[--j]) if(j==lo) break;
			if(i>=j) break;
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		int temp=a[lo];
		a[lo]=a[j];
		a[j]=temp;
		return j;
	}



	public static void print(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"   ");
		}
	}
	
	public static void main(String[] args) {
		int []a={42,76,157,137,93,24,159,12,121,11};
		sort(a);
		print(a);
	}
}
