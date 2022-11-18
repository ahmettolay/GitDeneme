package Class_Constructor;

public class LabAsistani extends AkademisyenAbstract implements IAkademisyenFonksiyonlari{

	public LabAsistani(String ad, String soyad, int telNo, String ePosta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telNo, ePosta, bolum, unvan, kapiNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void derseGir() {
		  System.out.println("Lab asistanı derse girdi."); 
	}
		
	@Override
	public void quizYap() {
		System.out.println("Lab asistanı quiz yaptı."); 	
	}
	
	@Override
	public void sinavYap() {
		System.out.println("Lab asistanı sınav yaptı."); 
	}
	
	

	@Override
	public String toString() {
		return "LabAsistani [bolum=" + bolum + ", unvan=" + unvan + ", kapiNo=" + kapiNo + ", ad=" + ad + ", soyad="
				+ soyad + ", telNo=" + telNo + ", ePosta=" + ePosta + "]";
	}

}
