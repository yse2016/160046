import java.io.*;

public class ShowText {
	public static void main(String[] args) {
			FileReader fr = null;
			BufferedReader in = null;
			String data = null;

		try{
			// ストリームをつくる。
			fr = new FileReader(data.txt);
			in = new BufferedReader(fr);

			while(ture){
			for(int i = 0; i < 10; i++){
				// 1行読む。
				data = in.readLine();

				// 1行出力する。
				System.out.println();
			}
			// ストリームを閉じる
			in.close();

		} catch (IOException e) {
			System.err.println("IO ERROR.");
		}
	}
}