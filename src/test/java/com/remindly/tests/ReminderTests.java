package com.remindly.tests;

import com.remindly.model.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase{

    @Test
    public void addReminderPositiveTest(){
        //tap on "add reminder"
        app.getMainScreen().tapOnAddReminder();
        //enter title
        app.getReminder().enterTitle(Data.TEXT);
        //tap on date field
        app.getReminder().tapOnDateField();
        //swipe to month
        app.getReminder().swipeToMonth(Data.PERIOD,Data.MONTH,Data.NUMBER);
        //select date
        app.getReminder().selectDate(Data.INDEX);
        //tap on year
        app.getReminder().tapOnYear();
        //swipe to year
        app.getReminder().swipeToYear(Data.PERIOD2,Data.YEAR);
        //tap on ok button
        app.getReminder().tapOnOK();
        //tap on time field
        app.getReminder().tapOnTimeField();
        //select time
        app.getReminder().selectTime(Data.TIMEOFDAY,Data.XHOUR,Data.YHOUR,Data.XMIN,Data.YMIN);
        //tap in OK
        app.getReminder().tapOnOK();
        //tap on repetition interval
        app.getReminder().tapOnRepetitionInterval();
        //define repetition
        app.getReminder().defineRepetition(Data.REPEAT);
        //swipe up
        app.getReminder().swipe(Data.START,Data.STOP);
        //tap on type of repetition
        app.getReminder().tapOnTypeOfRepetition();
        //select type of repetition
        app.getReminder().selectTypeOfRepetition(Data.TYPEREP);
        //save reminder
        app.getReminder().saveReminder();
        //assert by title
        Assert.assertTrue(app.getMainScreen().isREminderTitlePresent().contains(Data.TEXT));
    }
}
