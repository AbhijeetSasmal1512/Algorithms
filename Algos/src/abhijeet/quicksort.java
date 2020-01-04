package abhijeet;

import java.io.PrintWriter;

public class quicksort {
	
	int[] arr;
	public void input() {
		IOClass io = new IOClass();
		arr = io.input();
	}
	
	public int partition(int[] arr, int p, int r) {
		int i = p - 1;
		int x = arr[r];
		
		for (int j = p; j < r; j++) {
			if (arr[j] <= x) {
				i = i+1;
				int swap = arr[i];
				arr[i] = arr[j];
				arr[j] = swap;
			}
		}
		int swap = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = swap;
		return i+1;
	}
	
	public void sort(int[] arr, int p, int r, PrintWriter wr) {
		String json = "";
		if (p < r) {
			int q = partition(arr, p, r);
			sort(arr, p, q-1, wr);
			sort(arr, q+1, r, wr);
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

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		quicksort q = new quicksort();
//		IOClass io = new IOClass();
//		q.input();
//		q.sort(q.arr, 0, q.arr.length-1);
//		io.display(q.arr);
//	}

}
