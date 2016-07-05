//package com.epicodus.myrestaurants;
//
//import android.content.Intent;
//import android.os.Build;
//import android.widget.TextView;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.robolectric.Robolectric;
//import org.robolectric.RobolectricGradleTestRunner;
//import org.robolectric.annotation.Config;
//import org.robolectric.shadows.ShadowActivity;
//import org.robolectric.shadows.support.v4.Shadows;
//
//import static junit.framework.Assert.assertTrue;
//
//@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
//@RunWith(RobolectricGradleTestRunner.class)
//public class MainActivityTest {
//    private MainActivity activity;
//
//    @Before
//    public void setup() {
//        activity = Robolectric.setupActivity(MainActivity.class);
//    }
//
//    @Test
//    public void validateTextViewContent() {
//        TextView myRestaurantsTextView = (TextView) activity.findViewById(R.id.myRestaurants);
//        assertTrue("MyRestaurants".equals(myRestaurantsTextView.getText().toString()));
//    }
//
//    @Test
//    public void secondActivityStartedOnClick() {
//        activity.findViewById(R.id.findRestaurantButton).performClick();
//
//        // The intent we expect to be launched when a user clicks on the button
//        Intent expectedListByZip = new Intent(activity, RestaurantsActivity.class);
//
//        // An Android "Activity" doesn't expose a way to find out about activities it launches
//        // Robolectric's "ShadowActivity" keeps track of all launched activities and exposes this information
//        // through the "getNextStartedActivity" method.
//        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
//        Intent actualIntent = shadowActivity.getNextStartedActivity();
//
//        // Determine if two intents are the same for the purposes of intent resolution (filtering).
//        // That is, if their action, data, type, class, and categories are the same. This does
//        // not compare any extra data included in the intents
//        assertTrue(actualIntent.filterEquals(expectedListByZip));
//    }
//}
