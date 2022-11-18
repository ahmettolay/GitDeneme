package Class_Constructor;

public abstract class AkademisyenAbstract extends Calisan{
	
	public String bolum;
    public String unvan;
    public int kapiNo;
    
	public AkademisyenAbstract(String ad, String soyad, int telNo, String ePosta, String bolum, 
			String unvan, int kapiNo) {
		super(ad, soyad, telNo, ePosta);
		this.bolum = bolum;
		this.unvan = unvan;
		this.kapiNo = kapiNo;
	}

    public void labDersineGir() {
    	System.out.println("Lab Asistanı, lab dersine girdi");
    }

    public void yemekhaneyiKullan(){
        System.out.println("Akademisyenler yemekhaneyi kullanabilirler");
    }

    public void sinavYap(){
        System.out.println("Öğretim gövrevlisi ve asistanı sınav yaptı");
    }
}
