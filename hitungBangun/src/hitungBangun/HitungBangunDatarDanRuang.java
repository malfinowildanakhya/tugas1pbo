package hitungBangun;

public class HitungBangunDatarDanRuang {
	public static void main(String[] args) {
        hitungKelilingLingkaran(10);
        hitungLuasSegitigaSikuSiku(6, 8);
        hitungVolumeTabung(5, 10);
    }

    public static void hitungKelilingLingkaran(double diameter) {
        double jariJari = diameter / 2;
        double keliling = Math.PI * diameter;
        System.out.println("Keliling lingkaran dengan diameter " + diameter + " adalah: " + keliling);
    }

    public static void hitungLuasSegitigaSikuSiku(double alas, double tinggi) {
        double luas = (alas * tinggi) / 2;
        System.out.println("Luas segitiga siku-siku dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
    }

    public static void hitungVolumeTabung(double diameter, double tinggi) {
        double jariJari = diameter / 2;
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        System.out.println("Volume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah: " + volume);
    }
}

