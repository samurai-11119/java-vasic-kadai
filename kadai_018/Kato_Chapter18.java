package kadai_018;

abstract public class Kato_Chapter18 {
	//姓フィールド
	String familyName = "加藤";
	//名フィールド
	String givenName;
	//住所フィールド
	String address = "住所は東京都中野区〇×";

	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println(address + "です");
	}

	//個別の紹介を出力するメソッド
	abstract public void eachIntroduce();

	//
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
