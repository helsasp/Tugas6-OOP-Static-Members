package id.its.pbo.registration;

public class PendaftaranProgram {
	
	public static void main(String [] args) {
		Mahasiswa maha1 = new Mahasiswa("Helsa");
		Mahasiswa maha2 = new Mahasiswa ("Via");
		Mahasiswa maha3 = new Mahasiswa ("Nabhyla");
		Mahasiswa maha4 = new Mahasiswa ("Yasmin");
	
	
	System.out.println("Nama Mahasiswa 1 = "+ maha1.getNomorPendaftaran());
	System.out.println("Nama Mahasiswa 2 = "+ maha2.getNomorPendaftaran());
	System.out.println("Nama Mahasiswa 3 = "+ maha3.getNomorPendaftaran());
	System.out.println("Nama Mahasiswa 4 = "+ maha4.getNomorPendaftaran());
	System.out.println("Total Mahasiswa = "+ Mahasiswa.getTotalRegistrant());
	
	// Reset & Rewrite
	
	Mahasiswa.resetRegistrantCounter();
	
	// equals to 0
	System.out.println("Total Mahasiswa = "+ Mahasiswa.getTotalRegistrant());
	
	Mahasiswa maha5 = new Mahasiswa ("Harry");
	
	
	System.out.println("Nama Mahasiswa 5 = "+ maha5.getNomorPendaftaran());
	System.out.println("Total Mahasiswa = "+ Mahasiswa.getTotalRegistrant());
	
}
}