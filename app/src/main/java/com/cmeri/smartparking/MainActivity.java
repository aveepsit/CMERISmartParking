/*
 *      Created By: Aveepsit Chowdhury
 *      FIle Name: MainActivity.java
 *      Project Name: CMERI-Smart-Parking
 *      Created on: 20-01-2019 12:15 AM
 *      Additional Notes:
 */

package com.cmeri.smartparking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDash(View view) {
        startActivity(new Intent(this, Dashboard.class));
    }
}
