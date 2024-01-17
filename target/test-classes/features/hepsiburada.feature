
Feature: Hepsiburada Automation Test

  Background: LoginEntry

    Given The address "https://www.hepsiburada.com/" can be opened with the "chrome" browser.
          # "https://www.hepsiburada.com/" adresi "chrome" tarayıcı ile açılabilir.
    When  On the home page that opens, click on the login or sign up menu.
          # Açılan ana sayfada giriş yap menüsüne ardından giriş yap butonuna tıklanır.
    And   Click on the login link in the menu that opens.
          # Açılan menüdeki giriş linkine tıklayın.
    Then  On the login form that opens, it is verified that the login tab is selected.
          # Açılan giriş formunda giriş sekmesinin seçildiği doğrulanır.
    And   Valid data is entered in the email address or phone number field and click on the login button.
          # E-posta adresi veya telefon numarası alanına geçerli veriler girilir ve giriş düğmesine tıklanır.
    When  Valid data is entered in the password field and the login button is clicked.
          # Şifre alanına geçerli veriler girilir ve giriş butonuna tıklanır.


  Scenario: Login

    Then  Verifies that the system has been successfully logged in
          # Sisteme başarıyla oturum açıldığını doğrular
    And   Browser Closed

  @1
  Scenario: Adding and checking items to cart


    Given Click on the Book, Movie, Music, Hobby tab and select the Novel category from the Book section.
          # Kitap, Film, Müzik, Hobi tabına tıklanılarak Kitap bölümünden Roman kategorisi seçilmiştir
    When  It has been checked whether the selected category page can be loaded.
          # Seçilen kategori sayfasının yüklenip yüklenemediği kontrol edilmiştir
    But   The first film in the list is clicked.
          # Listenin ilk kitabına tıklanılmıştır.
    And   It has been checked whether the selected film page can be loaded.
          # Seçilen film sayfasının yüklenip yüklenemediği kontrol edilmiştir
    And   The number of elements in the basket has been checked.
          # Sepetteki eleman sayısı kontrol edilmiştir
    When  The book has been added to the cart.
          # Sepete kitap eklenilmiştir
    Then  The number of elements in the basket was checked one by one and it was confirmed that the number increased.
          # Sepetteki eleman sayısı tektardan kontrol edilerek sayının arttığı doğrulanmıştır
    And   Browser Closed

