package com.moringa.musicchat;

import android.content.Intent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;
@RunWith(RobolectricTestRunner.class)
public class RegisterActivityTest {
    private RegisterActivity activity;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(RegisterActivity.class);
    }

    @Test
    public void clickingRegister_shouldStartLoginActivity() {
        RegisterActivity activity = Robolectric.setupActivity(RegisterActivity.class);
        activity.findViewById(R.id.register).performClick();
        Intent expectedIntent = new Intent(activity, LoginActivity.class);
        Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
}
