package pageobject;

import utils.WebDriverManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.CommonConstants.UTN_AUTOMATION_ALIAS;

public class MyAddressesPage {

    public static void updateMyAddress() {
        WebDriverManagement.clickByCssSelector(".address_update .icon-chevron-right");
    }

    public static void updatePhoneField() {
        WebDriverManagement.sendKeysById("phone", "123456789");
    }

    public static void updateMobilePhoneField() {
        WebDriverManagement.sendKeysById("phone_mobile", "987654321");
    }

    public static void updateAddressField() {
        WebDriverManagement.sendKeysById("address1", "Street 443");
    }

    public static void updateCompanyField() {
        WebDriverManagement.sendKeysById("company", "UTN");
    }

    public static void updateAliasField() {
        WebDriverManagement.sendKeysById("alias", "UTN AUTOMATION");
    }

    public static void save() {
        WebDriverManagement.clickByCssSelector("#submitAddress > span");
    }

    public static void validateUpdatedAlias() {
        assertEquals(UTN_AUTOMATION_ALIAS, WebDriverManagement.getElementTextByCss(".page-subheading"));
    }
}
