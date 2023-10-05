package kadai.java_basic_kadai.kadai_011;

import java.util.Arrays;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// 配列の作成
		boolean[] primeNum = new boolean[101];  // 0～100に対応
		
		//primeNumの中身を全てtrueに
		Arrays.fill(primeNum, true);
		
		// 2は1と2でしか割り切れないので例外として処理する
		System.out.println(2);
		
		// primeNum[3]~[100]でfor文を回す
		for(int i = 3; i < primeNum.length; i++) {
			// 2~(j-1)の数で割り切れるか判定
			for(int j = 2; j < i; j++) {
				// 割り切れるとき、要素をfalseに変更し、loop終了
				if(i % j == 0) {
					primeNum[i] = false;
					break;
				}
				// loopの最後まで要素がtrueのとき、素数であるので出力
				if(j == i-1 && primeNum[i] == true) {
					System.out.println(i);
				}
			}
		}
	}

}
