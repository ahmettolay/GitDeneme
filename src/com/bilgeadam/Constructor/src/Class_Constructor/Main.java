package Class_Constructor;

public class Main {

	public static void main(String[] args) {
		
		LabAsistani asistan1 = new LabAsistani("Arda", "Ağdemir", 123456, "arda@mail.com", "Yazılım Mühendisliği", "Asistan", 5);
		System.out.println(asistan1);
		
		asistan1.derseGir();
		asistan1.sinavYap();
		asistan1.quizYap();
		System.out.println("=========================");
		asistan1.labDersineGir();
		asistan1.yemekhaneyiKullan();
	}

}
