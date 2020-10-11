package pageobject;

import utils.WebDriverManagement;

public class MyAccountPage {

    public static void navigateToMyAddressesPage() {
        WebDriverManagement.clickByCssSelector("li:nth-child(3) span:nth-child(2)");
    }
}
