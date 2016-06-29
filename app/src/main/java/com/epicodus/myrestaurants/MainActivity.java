package com.epicodus.myrestaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = MainActivity.class.getSimpleName();
//    private Button mFindRestaurantButton;
//    private EditText mLocationEditText;
//    private TextView mMyRestaurants;
    @Bind(R.id.findRestaurantButton) Button mFindRestaurantButton;
    @Bind(R.id.locationEditText) EditText mLocationEditText;
    @Bind(R.id.myRestaurants) TextView mMyRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

//        mMyRestaurants = (TextView) findViewById(R.id.myRestaurants);
        Typeface pacificoFont = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        mMyRestaurants.setTypeface(pacificoFont);

//        mLocationEditText = (EditText) findViewById(R.id.locationEditText);

//        mFindRestaurantButton = (Button) findViewById(R.id.findRestaurantButton);
//        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
//        mFindRestaurantButton.setTypeface(ostrichFont);

        mFindRestaurantButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mFindRestaurantButton) {
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}
