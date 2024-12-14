package coreJava;

class P11Computer {
	public void playMusic() {
		System.out.println("Music Playing...");
	}

	public String getMeAPen(int cost) {
		if (cost >= 10) {
			return "Pen";
		} else {
			return "Nothing";
		}
	}
}

public class P11Methods {

	public static void main(String[] args) {
		P11Computer obj = new P11Computer();
		obj.playMusic();
		String str = obj.getMeAPen(2);
		System.out.println(str);
	}

}
