package kadai.java_basic_kadai.kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		
		// 名前と点数の配列を定義
		String[] nameArray = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		int[] scoreArray = {10, 20 ,30, 40, 50, 60, 70, 80, 90, 100};
		
		int scoreSum = 0;
		
		// 配列の要素を繰り返し抽出
		for(int i = 0; i < nameArray.length; i++ ) {
			System.out.println( nameArray[i] + "さんの点数は" + scoreArray[i] + "点");
			
			// 合計点を計算
			scoreSum += scoreArray[i];
		}
		
		// 平均点を計算して出力
		System.out.println( "テストの平均点は" + (scoreSum / scoreArray.length) + "点");
	}

}
