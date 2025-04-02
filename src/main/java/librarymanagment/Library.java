package librarymanagment;


    import java.util.ArrayList;
import java.util.List;

    public class Library {
        //kitapların kaydedileceği listesi tanımlıyor
        private List<Book> kitaplar;

        public Library() {
            this.kitaplar = new ArrayList<>();
        }
//kitap ekleme
        public void kitapEkle(String isim, String yazar) {
            kitaplar.add(new Book(isim, yazar));
            System.out.println("'" + isim + "' başarıyla kütüphaneye eklendi.");
        }
// kitapalrı listeleme
        public void kitaplariListele() {
            if (kitaplar.isEmpty()) {
                System.out.println(" Kütüphanede hiç kitap yok!");
                return;
            }
            //kitaplar listelenir
            System.out.println("\n Kütüphanedeki Kitaplar:");
            for (Book kitap : kitaplar) {

                System.out.println(kitap);
            }
        }
//kitap arama
        public void kitapAra(String aranan) {
            for (Book kitap : kitaplar) {
                if (kitap.getIsim().equalsIgnoreCase(aranan)) {
                    System.out.println("Bulundu: " + kitap);
                    return;
                }
            }
            System.out.println(" Bu isimde bir kitap bulunamadı.");
        }

        public void kitapOduncAl(String kitapAdi) {
            for (Book kitap : kitaplar) {
                if (kitap.getIsim().equalsIgnoreCase(kitapAdi)) {
                    if (kitap.isOduncAlindi()) {
                        System.out.println(" Bu kitap zaten ödünç alınmış!");
                    } else {
                        kitap.setOduncAlindi(true);
                        System.out.println(" + kitapAdi " + " ödünç alındı!");
                    }
                    return;
                }
            }
            System.out.println(" Böyle bir kitap bulunamadı.");
        }

        public void kitapIadeEt(String kitapAdi) {
            for (Book kitap : kitaplar) {
                if (kitap.getIsim().equalsIgnoreCase(kitapAdi)) {
                    if (kitap.isOduncAlindi()) {
                        kitap.setOduncAlindi(false);
                        System.out.println("'" + kitapAdi + "' başarıyla iade edildi!");
                    } else {
                        System.out.println(" Bu kitap zaten kütüphanede mevcut!");
                    }
                    return;
                }
            }
            System.out.println(" Böyle bir kitap bulunamadı.");
        }
    }


