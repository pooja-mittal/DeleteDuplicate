package com.remove.duplicate.DeleteDuplicate;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a = { 1, 1, 3, 2, 1 };
		a = sortList(a);
		System.out.println("sorted elements ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		removeDuplicateElements(a);
	}

	public static int[] sortList(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void removeDuplicateElements(int[] a) {

		int j = 0;
		if (a == null || a.length == 0)
			return;
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				if (a[i] != a[i + 1]) {
					a[j++] = a[i];
				}
			} else
				break;
		}
		if (a[a.length - 1] != a[j]) {
			a[j++] = a[a.length - 1];
		}
		System.out.println("unique elements ");
		for (int i = 0; i < j; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
