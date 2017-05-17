package com.jds.androidautotestdemo;

import org.junit.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@Description("This is an example test suite")
public class ExampleUnitTest {
    @Title("Failing success")
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, new LoginActivity().add(1,3));
    }
}