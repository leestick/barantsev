package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends Testbase{

    @Test
    public void GroupDeletionTests() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }

}
