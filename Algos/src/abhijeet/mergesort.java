package abhijeet;

import java.io.PrintWriter;

import abhijeet.IOClass;

public class mergesort {
	
	int[] arr;
	
	public void input(IOClass io) {
		arr = io.input();
	}
	
	public void merge(int[] arr, int i, int j) {
		int mid = (i+j)/2;
		int left = ((j-i)/2)+1;
		int right = (j-i)+1 - left;
		
		int[] l_arr = new int[left];
		int[] r_arr = new int[right];
		
		for (int x = 0; x<left; x++) {
			int k = i;
			l_arr[x] = arr[k+x];
		}
		
		for (int x = 0; x<right; x++ ) {
			int k = mid+1;
			r_arr[x] = arr[k+x];
		}
		
		int l = 0, m = 0;
		for (int x = i; x<=j; x++)
		{
			if (l < l_arr.length & m < r_arr.length) {
				if (l_arr[l] < r_arr[m]) {
					arr[x] = l_arr[l];
					l++;
				} else {
					arr[x] = r_arr[m];
					m++;
				}
			} else if (l < l_arr.length) {
				arr[x] = l_arr[l];
				l++;
			} else {
				arr[x] = r_arr[m];
				m++;
			}
			
		}
	}
	
	public void sort(int[] arr, int i, int j , PrintWriter wr) {
		int r = (i+j)/2;
		String json = "";
		if (i < j) {
			sort(arr, i, r, wr);    //Left Half
			sort(arr, r+1, j, wr);  //Right Half
			merge(arr, i, j);
			ArrayToJson a = new ArrayToJson();
			json = a.arr_json(arr);
			wr.write(json+",");
		}
	}
	
	public void start(int arr[], PrintWriter wr) {
		wr.write("[");
		sort(arr, 0, arr.length-1, wr);
		wr.write("{\"merge\":\"merge\"}]");
	}
	
}

