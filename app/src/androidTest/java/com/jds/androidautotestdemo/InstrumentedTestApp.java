package com.jds.androidautotestdemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class InstrumentedTestApp{

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(
            LoginActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.jds.androidautotestdemo", appContext.getPackageName());
    }

    @Test
    public void testSum(){
        assertEquals(5,mActivityRule.getActivity().add(1,4));
    }

    @Test
    public void testAttemptLogin(){
        onView(withId(R.id.email)).perform(typeText("zhuyuliang@126.com"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("123445"),closeSoftKeyboard());
        onView(withId(R.id.email_sign_in_button)).perform(click());
//        assertEquals("登录成功",withContentDescription("登录成功"));
    }

    @Test
    public void testUIAutomatorLogin(){

    }

}
