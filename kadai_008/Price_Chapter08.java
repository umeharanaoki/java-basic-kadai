package kadai.java_basic_kadai.kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// 変数の宣言
		int userAge = 30;
		int serviceCost;
		int payment;
		
		// 条件分岐
		payment = switch(userAge) {
			case 10 -> serviceCost = 1000;
			case 20 -> serviceCost = 2000;
			case 30 -> serviceCost = 3000;
			case 40 -> serviceCost = 3000;
			case 50 -> serviceCost = 4000;
			case 60 -> serviceCost = 4000;
			case 70 -> serviceCost = 4000;
			case 80 -> serviceCost = 5000;
			default -> serviceCost = 500;
		};
		
		// 年代を入力した結果を出力
		System.out.println( userAge + "代の料金は" + payment + "円" );

	}

}
