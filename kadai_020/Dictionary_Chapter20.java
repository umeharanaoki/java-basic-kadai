package kadai.java_basic_kadai.kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	HashMap<String,String> fluitsDic = new HashMap<String,String>();
	public Dictionary_Chapter20() {
		fluitsDic.put("apple","りんご");
		fluitsDic.put("peach","桃");
		fluitsDic.put("banana","バナナ");
		fluitsDic.put("lemon","レモン");
		fluitsDic.put("pear","梨");
		fluitsDic.put("kiwi","キウィ");
		fluitsDic.put("strawberry","いちご");
		fluitsDic.put("grape","ぶどう");
		fluitsDic.put("muscat","マスカット");
		fluitsDic.put("cherry","さくらんぼ");
	}
	
	
	// 調べる英単語が辞書に追加されているか調べる
	public void consultDic(String eng) {
		if(fluitsDic.get(eng) == null) {
			System.out.println(eng + "は辞書に存在しません");
		} else {
			String fluit = fluitsDic.get(eng);
			System.out.println(eng + "の意味は" + fluit);
		}
	}
}
