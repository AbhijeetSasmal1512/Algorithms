package abhijeet;

public class ArrayToJson {
	
	String arr_json(int arr[]) {
		String json = "";
		for (int i =0; i<arr.length; i++) {
			json = json + String.format("\"%d\",", arr[i]);
		}
		json = json.substring(0, json.length() - 1);
		json = "["+json+"]";
		return json;
	}

}
