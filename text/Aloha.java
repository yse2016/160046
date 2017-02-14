// Aloja.java

import java.util.HashMap;

public class Aloha {
	public static void main(String[] args) {
		// テキストデータをつくる
		String src = "Kyoko was a high school student. Jennifer, a student from Canada, was staying with Kyoko's family.";		// HashMap

		//	データをきれいにする(replace())
		src = src.replace(".", "");
		src = src.replace(",", "");
		src = src.replace("'s", "");

		System.out.println(src);

		// 単語に区切る(split())
		String[] kekka = src.split(" ");

		// 単語数をしらべる
		System.out.println("単語数: "+kekka.length);

		// HashMapをつくる
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// 単語情報
		String[] words = new String[kekka.length];
		int numWords = 0;

		// 単語数だけ、くり返し処理
		for(int i = 0; i < kekka.length; i++) {
			// 単語数を、変数 target に入れる
			String target = kekka[i];
			System.out.println(target);

			// target が、登録済みか？確認＆対応
			if(hm.containsKey(target)){
				// 登録済み
				System.out.println(target+"は、登録済みなので、++");

				// 現在の数値をしらべる
				int numVal = hm.get(target);
				// 数値を++する
				numVal++;
				// 新しい数値を保存する
				hm.put(target, numVal);
			} else {
				// 未登録の場合
				System.out.println(target+"は、未登録なので、登録します");
				hm.put(target, 1);

				// 単語リストに、新しく加える
				words[numWords] = target;
				// 単語数を++する
				numWords++;

				System.out.println("numWords: "+numWords);
			}
		}

		// 単語を表示する
		for(int i = 0; i < numWords; i++){
			String word = words[i];
			int age = hm.get(word);
			System.out.println(word+": "+age);
		}
	}
}
