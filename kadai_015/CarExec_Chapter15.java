package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		//車データを作成
		Car abc = new Car(1, 10);

		//ギアを3に変更
		abc.gearChange(3);

		abc.run();

	}

}
