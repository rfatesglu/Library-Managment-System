package librarymanagment;

    public class Book {

            private String isim;
            private String yazar;
            private boolean oduncAlindi;

            public Book(String isim, String yazar) {
                this.isim = isim;
                this.yazar = yazar;
                this.oduncAlindi = false;
            }

            public String getIsim() {
                return isim;
            }

            public String getYazar() {
                return yazar;
            }

            public boolean isOduncAlindi() {
                return oduncAlindi;
            }

            public void setOduncAlindi(boolean durum) {
                this.oduncAlindi = durum;
            }

            @Override
            public String toString() {
                return "- " + isim + " (" + yazar + ") [" + (oduncAlindi ? "Ödünç Alındı" : "Mevcut") + "]";
            }
        }


