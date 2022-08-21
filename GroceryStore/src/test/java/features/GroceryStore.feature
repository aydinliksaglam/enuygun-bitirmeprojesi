Feature:Verify different operations using Rest Assured and Grocery Store Apis
  Scenario: Verify one stok fiyat bilgisi
    Given I perform Get Operations for "/stok fiyat bilgisi"
    And I perform Get for the Character number "2"
    Then I should see Character's name as "grapes"

  Scenario: Verify İsim Get parameter
    Given I perform Get Operations for "/isim"
    Then I should see verify GET parameter

   Scenario: Verify one Yeni ürün ekleme
     Given I perform Get operations for Yeni ürün ekleme
     And I should to perform a "Post" operation
     Then I should to check the added product