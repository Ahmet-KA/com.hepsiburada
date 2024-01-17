com.hepsiburada gerçek kullanıcı datası ile otomasyon project
Otomasyon projesinde Java, IntejijIDEA, Selenium WebDriver, Cucumber , Allure Report , Extend Report kullanılmıştır.

Feature dosyasında senaryolar oluşturulmuş olup stepDefinitions class'ında senaryolara ait steplerin otomasyon scriptleri yazılmıştır.

Senaryolar parametrik çalışak şekilde hazırlanmış dır ve çalışılacak browser senaryo üzerinden belirtilebilmektedir.

page class oluşturulup PageFactory pattern ile ilgili class'larda web element ler xpath kullanılarak ve yardımcı methodlar tutulmuştur.

Otomasyon suitinde yapılan işlemler;

The address "https://www.hepsiburada.com/" can be opened with the "chrome" browser.

"https://www.hepsiburada.com/" adresi "chrome" tarayıcı ile açılabilir.
On the home page that opens, click on the login or sign up menu.

Açılan ana sayfada giriş yap menüsüne ardından giriş yap butonuna tıklanır.
Click on the login link in the menu that opens.

Açılan menüdeki giriş linkine tıklayın.
On the login form that opens, it is verified that the login tab is selected.

Açılan giriş formunda giriş sekmesinin seçildiği doğrulanır.
Valid data is entered in the email address or phone number field and click on the login button.

E-posta adresi veya telefon numarası alanına geçerli veriler girilir ve giriş düğmesine tıklanır.
Valid data is entered in the password field and the login button is clicked.

Şifre alanına geçerli veriler girilir ve giriş butonuna tıklanır.
Click on the Book, Movie, Music, Hobby tab and select the Novel category from the Book section.

Kitap, Film, Müzik, Hobi tabına tıklanılarak Kitap bölümünden Roman kategorisi seçilmiştir
It has been checked whether the selected category page can be loaded.

Seçilen kategori sayfasının yüklenip yüklenemediği kontrol edilmiştir
The first film in the list is clicked.

Listenin ilk kitabına tıklanılmıştır.
It has been checked whether the selected film page can be loaded.

Seçilen film sayfasının yüklenip yüklenemediği kontrol edilmiştir
The number of elements in the basket has been checked.

Sepetteki eleman sayısı kontrol edilmiştir
The book has been added to the cart.

Sepete kitap eklenilmiştir
The number of elements in the basket was checked one by one and it was confirmed that the number increased.

Sepetteki eleman sayısı tektardan kontrol edilerek sayının arttığı doğrulanmıştır