package DS;

import java.awt.dnd.MouseDragGestureRecognizer;

public class Merge {
	private static int[] aux;
	
	public static void sort(int[] a) {
		aux = new int[a.length];
		sort(a,0,a.length-1);
		
	}
	
	private static void sort(int[] a,int lo, int hi) {
		if (hi<=lo) return;
		int mid=(lo+hi)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}

	private static void merge(int[] a, int lo, int mid, int hi) {
		// TODO Auto-generated method stub
		int i=lo, j=mid+1;
		
		for(int k =lo;k<=hi;k++)
			aux[k]=a[k];
		
		for (int k = lo; k <= hi; k++) {
			if		(i>mid)					a[k]=aux[j++];
			else if	(j>hi)					a[k]=aux[i++];
			else if	(aux[j]<aux[i])			a[k]=aux[j++];
			else							a[k]=aux[i++];
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
