class bangun {
    protected String nama;

    bangun(String nama) {
        this.nama = nama;
    }

    void display() {
        System.out.println("Nama Bangun : " + this.nama);
    }
}

class bangundatar extends bangun {
    String tipe;

    bangundatar(String nama) {
        super(nama);
        this.tipe = "Bnagun Datar";
    }

    public static int volume(int p, int l, int t) {
        return p * l * t;
    }

    public static int lebar(int v, int p, int t) {
        return v / (p * t);
    }

    public static int tinggi(int v, int p, int l) {
        return v / (p * l);
    }

    public static int luas(int p, int l) {
        return p * l;
    }

    /*
     * public static double luas(double p, double l) {
     * return p * l;
     * }
     */

    public static int p(int luas, int l) {
        return luas / l;
    }

    void display() {
        System.out.println("Nama Bangun : " + this.nama);
        System.out.println("Tipe : " + this.tipe);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        bangundatar datar1 = new bangundatar("persegi panyang");
        datar1.display();

        int volume = datar1.volume(12, 8, 4);
        System.out.println("Volume : " + volume);

        int panjang = datar1.p(48, 8);
        System.out.println("panjangnya :" + panjang);

        int lebar = datar1.lebar(384, 6, 8);
        System.out.println("Lebarnya : " + lebar);

        int tinggi = datar1.tinggi(384, 6, 8);
        System.out.println("Tingginya : " + tinggi);

        int luas = datar1.luas(6, 8);
        System.out.println("Luasnya : " + luas);
    }
}
