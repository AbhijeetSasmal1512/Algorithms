package abhijeet;

import java.io.PrintWriter;
import abhijeet.ArrayToJson;

public class insertionsort {
	
	public void sort(int[] arr, char flag, PrintWriter wr) {
		boolean flags = false;
		String json = "[";
		wr.write(json);
		int count = 0;
		if (flag == 'r') 
			flags = true;
		for (int i = 1; i<arr.length; i++) {
			for (int j = 0; j<i; j++) {
				if ((arr[j] > arr[i]) ^ flags) {
					int x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
				}
				
			}
			count++;
			ArrayToJson a = new ArrayToJson();
			json = a.arr_json(arr);
			wr.write(json+",");
		}
		wr.write("{\"count\":\""+count+"\"}]");
	}
}
