package lesson8;

public class CesarCryptogramTest {

	public static void main(String[] args) {
		CesarCryptogram crypt = new CesarCryptogram(1);
		System.out.println(crypt.encrypt("Золотые купола"));
		System.out.println(crypt.decrypt("Ипмпуьж лфрпмб"));
		
		for (int i = 0; i < 300; i++) {
			System.out.println(i + " "+ (char)i);
		}

	}

}
