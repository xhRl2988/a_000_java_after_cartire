package tire;

public class HankookTire extends Tire{
	// 필드 생성자 overloading
	public HankookTire(String loString, int maxRotation) {
		super(loString, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"HankookTire 수명: "+
		(maxRotation - accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
