public class Rumah {
    public String ruangTamu;  // Bisa diakses oleh siapa saja
    
    public void bukaPintu() {
        System.out.println("Pintu depan dibuka!");
    }
} 

class Main {
    public static void main(String[] args) {
        Rumah rumah = new Rumah();
        rumah.ruangTamu = "Ruang Tamu Utama";  // Akses terbuka
        rumah.bukaPintu();  // Bisa diakses dari luar kelas
    }
}
// Dalam contoh ini, ruangTamu dan metode bukaPintu() diberi akses public, yang artinya bisa diakses oleh siapa saja, baik dari dalam kelas yang sama atau kelas lain.

public class Rumah {
    private String kamarTidur;  // Hanya bisa diakses oleh penghuni rumah
    
    private void kunciPintu() {
        System.out.println("Pintu kamar tidur terkunci!");
    }

    public void masukKamar(String username) {
        if (username.equals("pemilik")) {
            kamarTidur = "Kamar Tidur Utama";  // Akses khusus untuk pemilik
            kunciPintu();  // Hanya pemilik yang bisa mengunci
            System.out.println("Pemilik masuk ke kamar tidur.");
        } else {
            System.out.println("Tamu tidak bisa masuk kamar tidur.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Rumah rumah = new Rumah();
        rumah.masukKamar("pemilik");  // Akses berhasil, karena pemilik
        rumah.masukKamar("tamu");     // Akses gagal, tamu tidak bisa masuk
    }
}

//Dalam contoh ini, kamarTidur dan metode kunciPintu() bersifat private, artinya hanya dapat diakses oleh metode atau kode dalam kelas yang sama. masukKamar adalah metode public yang bisa digunakan untuk memberikan akses ke kamarTidur, namun hanya jika kondisi tertentu dipenuhi.

public class Rumah {
    protected String ruangMakan;  // Bisa diakses oleh keluarga atau penghuni rumah
    
    protected void siapkanMakan() {
        System.out.println("Makanan siap disajikan!");
    }
}

class Keluarga extends Rumah {
    public void makanBersama() {
        ruangMakan = "Ruang Makan Utama";  // Akses berhasil karena Keluarga adalah subclass
        siapkanMakan();  // Keluarga bisa mengakses metode protected
        System.out.println("Keluarga makan bersama.");
    }
}

class Main {
    public static void main(String[] args) {
        Keluarga keluarga = new Keluarga();
        keluarga.makanBersama();  // Keluarga bisa mengakses ruang makan dan menyiapkan makan
    }
}
//Dalam contoh ini, ruangMakan dan metode siapkanMakan() diberi akses protected, artinya hanya bisa diakses oleh kelas yang sama (Rumah), kelas turunan (Keluarga), atau kelas lain dalam paket yang sama. Keluarga sebagai subclass dapat mengakses dan memodifikasi ruangMakan.

 
