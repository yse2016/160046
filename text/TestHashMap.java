// TestHashMap.java
//	HashMapのテスト

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		// HashMapを、つくる
		HashMap<String, String> hm = new HashMap<String, String>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();

		// HashMapに、データを、いれる
		hm.put("apple", "りんご");

		// いれたデータを、表示する
		String data = hm.get("apple");
		System.out.println(data);

		// HashMap hm2 に、データを、いれる
		hm2.put("Yoshino", 42);
		hm2.put("Yamaguchi", 43);
		hm2.put("Aoki", 52);

		if(hm2.containsKey("Jennifer")){
			System.out.println("Jenniferは既に登録済みです。");
		} else {
			hm2.put("Jennifer", 1);
		}

		System.out.println("Jennifer: "+hm2.get("Jennifer"));

		// いれたデータを、表示する
		int toshi = hm2.get("Aoki");
		System.out.println("Aoki: " + toshi);
	}
}
