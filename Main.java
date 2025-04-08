public class Main {
    public static void main(String[] args) {
        // Membuat karakter 
        Character player = new Character("Siswa", 100);

        // Membuat adegan
        Scene scene1 = new Scene("Kamu berada di depan rumah guru saat malam hari, pintu depan sedikit terbuka.",
                "Masuk lewat pintu depan", null, 0, 5,
                "Cari jalan lain", null, 0, 0,
                "Pulang saja", null, 0, 0);

        Scene scene2 = new Scene("Kamu di ruang tamu. Guru ada di dapur, suara langkahnya terdengar.",
                "Sembunyi di balik sofa", null, 0, 5,
                "Hidupkan TV sekeras-kerasnya", null, 20, 10,
                "Lari ke dapur", null, 0, 0);

        Scene scene3 = new Scene("Kamu menemukan jendela terbuka di samping rumah.",
                "Masuk lewat jendela", null, 10, 5,
                "Cari alat di luar", null, 0, 10,
                "Kembali ke pintu depan", scene1, 0, 0);

        Scene scene4 = new Scene("Kamu bersembunyi di balik sofa. Ada kaleng cat di dekatmu.",
                "Ambil kaleng cat", null, 0, 10,
                "Tetap diam", null, 0, 5,
                "Lari ke luar", null, 20, 0);

        Scene scene5 = new Scene("TV berbunyi keras. Guru masuk dan melihatmu!",
                "Kabur ke dapur", null, 30, 0,
                "Sembunyi lagi", scene4, 20, 5,
                "Hadapi Guru", null, 100, 0);

        Scene scene6 = new Scene("Kamu di dapur. Ada ember air di meja.",
                "Ambil ember air", null, 0, 10,
                "Tuang air ke lantai", null, 0, 15,
                "Mencari pintu keluar", null, 0, 5);

        Scene scene7 = new Scene("Kamu menemukan lem di taman belakang.",
                "Ambil lem", null, 0, 10,
                "Kembali ke jendela", scene3, 0, 0,
                "Masuk rumah", scene4, 0, 5);

        Scene scene8 = new Scene("Kamu punya item. Guru di dekat tangga.",
                "Gunakan item pada Guru", null, 0, 20,
                "Sembunyi lagi", scene5, 0, 5,
                "Kabur", scene4, 0, 10);

        Scene scene9 = new Scene("Guru terpeleset karena prank-mu dan marah besar!",
                "Kabur sekarang", null, 20, 20,
                "Lanjutkan prank", scene5, 30, 10,
                "Sembunyi", scene4, 0, 5);

        Scene scene10 = new Scene("Kamu di pintu keluar. Guru hampir menangkapmu!",
                "Lari pulang", null, 0, 50,
                "Hadapi Guru", null, 100, 0,
                "Cari prank terakhir", scene9, 20, 10);

        // Menghubungkan adegan
        scene1 = new Scene("Kamu berada di depan rumah guru saat malam hari, pintu depan sedikit terbuka.",
                "Masuk lewat pintu depan", scene2, 0, 5,
                "Cari jalan lain", scene3, 0, 0,
                "Pulang saja", null, 0, 0);

        scene2 = new Scene("Kamu di ruang tamu. Guru ada di dapur, suara langkahnya terdengar.",
                "Sembunyi di balik sofa", scene4, 0, 5,
                "Hidupkan TV sekeras-kerasnya", scene5, 20, 10,
                "Lari ke dapur", scene6, 0, 0);

        scene3 = new Scene("Kamu menemukan jendela terbuka di samping rumah.",
                "Masuk lewat jendela", scene4, 10, 5,
                "Cari alat di luar", scene7, 0, 10,
                "Kembali ke pintu depan", scene1, 0, 0);

        scene4 = new Scene("Kamu bersembunyi di balik sofa. Ada kaleng cat di dekatmu.",
                "Ambil kaleng cat", scene8, 0, 10,
                "Tetap diam", scene9, 0, 5,
                "Lari ke luar", scene10, 20, 0);

        scene5 = new Scene("TV berbunyi keras. Guru masuk dan melihatmu!",
                "Kabur ke dapur", scene6, 30, 0,
                "Sembunyi lagi", scene4, 20, 5,
                "Hadapi Guru", null, 100, 0);

        scene6 = new Scene("Kamu di dapur. Ada ember air di meja.",
                "Ambil ember air", scene8, 0, 10,
                "Tuang air ke lantai", scene9, 0, 15,
                "Mencari pintu keluar", scene10, 0, 5);

        scene7 = new Scene("Kamu menemukan lem di taman belakang.",
                "Ambil lem", scene8, 0, 10,
                "Kembali ke jendela", scene3, 0, 0,
                "Masuk rumah", scene4, 0, 5);

        scene8 = new Scene("Kamu punya item. Guru di dekat tangga.",
                "Gunakan item pada Guru", scene9, 0, 20,
                "Sembunyi lagi", scene5, 0, 5,
                "Kabur", scene4, 0, 10);

        scene9 = new Scene("Guru terpeleset karena prank-mu dan marah besar!",
                "Kabur sekarang", scene10, 20, 20,
                "Lanjutkan prank", scene5, 30, 10,
                "Sembunyi", scene4, 0, 5);

        scene10 = new Scene("Kamu di pintu keluar. Guru hampir menangkapmu!",
                "Lari pulang", null, 0, 50,
                "Hadapi Guru", null, 100, 0,
                "Cari prank terakhir", scene9, 20, 10);

        // Memulai cerita
        Story story = new Story(scene1, player);
        story.start();
    }
}