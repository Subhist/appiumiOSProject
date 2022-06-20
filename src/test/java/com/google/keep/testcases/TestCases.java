package com.google.keep.testcases;

import com.google.keep.config.BaseSetup;
import org.testng.annotations.Test;

public class TestCases extends BaseSetup {

   @Test(priority = 1)
   public void verifyWhenNoNotesPresent(){
   homeScreenActions.verifyEmptyNotesDashboard();
   }


   @Test(priority = 2)
    public void addNotes(){
       homeScreenActions.addNotesUPlusButton();
       addNotesPageActions.addTitle();
       addNotesPageActions.addNotes();
       addNotesPageActions.goBackBtn();
       addNotesPageActions.verifyTitle();
   }

   @Test(priority = 3)
   public void changeListViewToGridView(){
      homeScreenActions.changeToMultiGridView();
   }

   @Test(priority = 4)
   public void pinNote(){
      addNotesPageActions.editNotes();
      addNotesPageActions.pinNotes();
   }

   @Test(priority = 5)
   public void deleteNote(){
      addNotesPageActions.editNotes();
      addNotesPageActions.deleteNotes();
      homeScreenActions.verifyEmptyNotesDashboard();
   }
}
