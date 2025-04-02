package librarymanagment;

    import java.util.Scanner;

    public class KullaniciArayuzu {
       //Library nesnesi kitapların yönetildiği system
        private Library library;
        private Scanner scanner;

      //yapıcı metod
        public KullaniciArayuzu() {
            this.library = new Library();
            this.scanner = new Scanner(System.in);
        }

        public void baslat() {
            while (true) {
                //ana menü şeçeneklerini ekrana yazdırır
                System.out.println("**KÜTÜPHANE MENÜSÜ**");
                System.out.println("1️⃣ Kitap Ekle");
                System.out.println("2️⃣ Kitapları Listele");
                System.out.println("3️⃣ Kitap Ara");
                System.out.println("4️⃣ Kitap Ödünç Al");
                System.out.println("5️⃣ Kitap İade Et");
                System.out.println("6️⃣ Çıkış");
                System.out.print("-> Seçiminizi yapın: ");

                String secim = scanner.nextLine().trim();

                //kullanıcının şeçimlerine uygum metod çağırır
                switch (secim) {
                    case "1":
                        kitapEkle();
                        break;
                    case "2":
                        library.kitaplariListele();
                        break;
                    case "3":
                        kitapAra();
                        break;
                    case "4":
                        kitapOduncAl();
                        break;
                    case "5":
                        kitapIadeEt();
                        break;
                    case "6":
                        System.out.println("📌 Programdan çıkılıyor...");
                        return;
                    default:
                        System.out.println(" Geçersiz seçim! Lütfen tekrar deneyin.");
                }
            }
        }
//kullanıcıdan kitap adı ve yazar adı istenir.
        private void kitapEkle() {
            System.out.print(" Kitap adı: ");
            String isim = scanner.nextLine().trim();
            System.out.print(" Yazar adı: ");
            String yazar = scanner.nextLine().trim();
           library.kitapEkle(isim, yazar);
        }

        private void kitapAra() {
            System.out.print(" Aramak istediğiniz kitap adını girin: ");
            String kitapAdi = scanner.nextLine().trim();
           library.kitapAra(kitapAdi);
        }

        private void kitapOduncAl() {
            System.out.print(" Ödünç almak istediğiniz kitap adı: ");
            String kitapAdi = scanner.nextLine().trim();
          library.kitapOduncAl(kitapAdi);
        }

        private void kitapIadeEt() {
            System.out.print(" İade etmek istediğiniz kitap adı: ");
            String kitapAdi = scanner.nextLine().trim();
            library.kitapIadeEt(kitapAdi);
        }
    }

