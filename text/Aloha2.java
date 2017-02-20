// Aloha2.java
//	HashMap: put() get()
//				containsKey()
//				replace(): valueを更新
//				remove(): 削除
//	[key -> value]のセットを保存する
//	["Yoshino" -> 42]
//	["Yoshino" -> "Ryokuen"]
//	[160999		-> "Yoshino"]

import java.util.HashMap;

public class Aloha2 {
	public static void main(String[] args) {
		// データ準備
		String key = "";
		String value = "";

		// HashMapをつくる
		HashMap<String, String> hm = new HashMap<String, String>();

		// データをいれる
		hm.put("Yoshino", "Yokohama");
		hm.put("Aoki", "Ebina");

		// データをとりだして、表示する
		String val = hm.get("Aoki");
		System.out.println("Aoki: " + val);

		// args[0]をKey、 args[1]をValueをして新しく
		args[0] = key;
		args[1] = value;

		// ↑入れたデータを、表示する
		System.out.println(key + value);

		// HashMapのデータを全権表示する
		hm.forEach((keyName, valueAddress) -> System.out.println(keyName+":"+valueAddress));
	}
}


