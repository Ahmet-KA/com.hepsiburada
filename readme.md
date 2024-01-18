com.hepsiburada gerçek kullanıcı datası ile otomasyon project

Otomasyon projesinde Java, IntejijIDEA, Selenium WebDriver, Cucumber , Allure Report , Extend Report kullanılmıştır.

Feature dosyasında senaryolar oluşturulmuş olup stepDefinitions class'ında senaryolara ait steplerin otomasyon scriptleri yazılmıştır.

Senaryolar parametrik çalışak şekilde hazırlanmış dır ve çalışılacak browser senaryo üzerinden belirtilebilmektedir.

page class oluşturulup PageFactory pattern ile ilgili class'larda web element ler xpath kullanılarak ve yardımcı methodlar tutulmuştur.

Otomasyon suitinde yapılan işlemler;



"https://www.hepsiburada.com/" adresi "chrome" tarayıcı ile açılabilir.

Açılan ana sayfada giriş yap menüsüne ardından giriş yap butonuna tıklanır.

Açılan menüdeki giriş linkine tıklayın.

Açılan giriş formunda giriş sekmesinin seçildiği doğrulanır.

E-posta adresi veya telefon numarası alanına geçerli veriler girilir ve giriş düğmesine tıklanır.

Şifre alanına geçerli veriler girilir ve giriş butonuna tıklanır.

Kitap, Film, Müzik, Hobi tabına tıklanılarak Kitap bölümünden Roman kategorisi seçilmiştir

Seçilen kategori sayfasının yüklenip yüklenemediği kontrol edilmiştir

Listenin ilk kitabına tıklanılmıştır.

Seçilen film sayfasının yüklenip yüklenemediği kontrol edilmiştir

Sepetteki eleman sayısı kontrol edilmiştir

Sepete kitap eklenilmiştir

Sepetteki eleman sayısı tektardan kontrol edilerek sayının arttığı doğrulanmıştır
