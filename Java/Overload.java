// Overload.java
// オーバーロードのテスト

public class Overload {
	public static void main(String[] args) {
		// 準備
		OverloadMan man = new OverloadMan();

		// メソッドを使う
		man.sayAloha();
		man.sayAloha("Aoki");
		man.sayAloha(20);
		// man.sayAloha(10, 4, "あおき");
	}
}


class OverloadMan {
	// field
	private String nameK;	// 漢字名
	private String nameH;	// ひらがな

	// metthod
	// 引数なし版
	public void sayAloha() {
		System.out.println("ALOHA!");
	}

	// 引数: 文字列１個
	public void sayAloha(String str) {
		System.out.println("ALOHA!"+ str);
	}

	// 引数: 整数１個
	public void sayAloha(int man){
		for(int i = 0; i < 20; i++) {
			System.out.println(i + "ALOHA!");
		}
	}
}
