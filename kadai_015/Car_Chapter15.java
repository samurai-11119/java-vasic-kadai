package kadai_015;

//車クラス
class Car {
	//フィールド内部データ
	private int gear = 1;//1速から5速のギアを表す
	private int speed = 10;//ギアチェンジ後の速度を表す

	//コンストラクタ
	public Car(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;

		System.out.println("現在ギア" + this.gear + "、速度は時速" + this.speed + "kmです");
	}

	//メソッドを受けて速度を更新する
	public void gearChange(final int number) {
		System.out.println("ギア" + gear + "から" + number + "に切り替えました");

		//ギアが1～5以外なら時速10km
		if (number >= 1 && 5 >= number) {
			run(number);
		} else {
			System.out.println("速度は時速10kmです");

		}

	}

	//速度を計算する
	public void run(final int number) {
		int changespeed = number * 10;
		System.out.println("速度は" + "時速" + changespeed + "kmです");
	}
}