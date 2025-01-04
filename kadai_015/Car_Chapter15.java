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
	public void gearChange(final int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
		//ギアが1～5以外なら時速10km
		this.speed = switch (this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};

	}

	//速度を計算する
	public void run() {

		System.out.println("速度は" + "時速" + this.speed + "kmです");
	}
}