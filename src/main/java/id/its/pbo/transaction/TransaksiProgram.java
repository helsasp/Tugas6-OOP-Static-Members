package id.its.pbo.transaction;

public class TransaksiProgram {
	
	public static void main (String [] args) {
		
		Transaksi transaksi1 = new Transaksi (10.77);
		Transaksi transaksi2 = new Transaksi (40.35);
		Transaksi transaksi3 = new Transaksi (30.29);
		
		System.out.println("ID Transaksi 1 = " + transaksi1.getTransaksiID());
		System.out.println("ID Transaksi 2 = " + transaksi2.getTransaksiID());
		System.out.println("ID Transaksi 3 = " + transaksi3.getTransaksiID());
		
		//reset
		Transaksi.resetCounter();
		
		//recheck
		
		Transaksi transaksi4 = new Transaksi (15.45);
		Transaksi transaksi5 = new Transaksi (75);
		System.out.println("ID Transaksi 4 = " + transaksi4.getTransaksiID());
		System.out.println("ID Transaksi 5 = " + transaksi5.getTransaksiID());
		System.out.println("Total Transaksi setelah reset : " + Transaksi.getTotalTransaksi());
		
	}

}
