package kadai.java_basic_kadai.kadai_017;

abstract public class Kato_Chapter17 {
	// フィールド
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	// セッター
		public void setGivenName(String givenName) {
			this.givenName = givenName;
		}
		
	// 共通紹介メソッド
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	// 抽象メソッド
	abstract void eachIntroduce();
	

	// 実行メソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
