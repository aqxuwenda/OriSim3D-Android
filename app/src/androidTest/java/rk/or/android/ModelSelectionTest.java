package rk.or.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class ModelSelectionTest {
    @Rule
    public ActivityTestRule<ModelSelection> activityRule =
            new ActivityTestRule<>(ModelSelection.class);

    @Test
    public void creation() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("rk.or.android", appContext.getPackageName());

        Activity activity = activityRule.getActivity();
        assertNotNull(activity);

        Intent intent = activity.getIntent();
        assertEquals("intent:", "android.intent.action.MAIN", intent.getAction());
    }

    @Test
    public void onItemClick() {
        ViewInteraction vi = onView(withId(R.id.grid));
        assertNotNull(vi);
        vi.perform(click());
        // And now, I don't know what to assert.
    }
}