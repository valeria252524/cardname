import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTests {

    @Test
    @DisplayName("Adding valid name Тимоти Шаломе")
    public void validCardName(){
        Account account = new Account("Тимоти Шаломе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Adding short name Ти")
    public void cardNameIsShorterThan3(){
        Account account = new Account("Ти");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Adding long name Тимотиииии Шаалоомеее")
    public void cardNameIsLongerThan19(){
        Account account = new Account("Тимотиииии Шаалоомеее");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Adding space in the end ТимотиШаломе ")
    public void spaceIsInTheEnd(){
        Account account = new Account("ТимотиШаломе ");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Adding space in the begin  ТимотиШаломе")
    public void spaceIsInTheBegin(){
        Account account = new Account(" ТимотиШаломе");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Adding two spaces Тимоти  Шаломе")
    public void twoSpacesInCardName(){
        Account account = new Account("Тимоти  Шаломе");
        assertFalse(account.checkNameToEmboss());
    }
}
