// TestHashMap2.java
//	args[0]をつかって
//	↑
//	↑

import java.util.HashMap;

public class TestHashMap2 {
	public static void main(String[] args) {
		// HashMapを、つくる
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// *hm.put("Yoshino", 42);

		// HashMapを、表示する
		int age = hm.get("Yoshino");
		System.out.println("Yoshino: "+ age);

		// arg[0]を、つかう
		System.out.println(args[0]);

		// args[0]が、HashMapにあるか、しらべる
		// 当然、false
		String target = args[0];
		System.out.println(hm.containsKey(target));

		// 新しいデータならば、登録する。
		if(hm.containsKey(target)){
			// true: 新しくない
			System.out.println("既に存在します");
			// 既存の値を１増やす
			//	1.既存の値を習得する
			int ageValue = hm.get(target);

			//	2.習得した値を、1増やす
			ageValue++;

			//	3.新しい値を、マップに保存する
			hm.put(target, ageValue);
		} else {
			// false: 新しい
			System.out.println("存在しません。登録します");
			hm.put(target, 1);
		}

		// HashMapを表示する
		int value = hm.get("Yoshino");
		System.out.println("Yoshino: "+value);

		value
		System.out.println("Yoshino"+"");
	}
}
