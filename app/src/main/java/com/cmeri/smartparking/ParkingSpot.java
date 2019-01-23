/*
 *      Created By: Aveepsit Chowdhury
 *      File Name: ParkingSpot
 *      Project Name: CMERI-Smart-Parking
 *      Created on: 23-01-2019 06:00 PM
 *      Additional Notes:
 */

package com.cmeri.smartparking;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;

@SuppressLint("ViewConstructor")
public class ParkingSpot extends AppCompatTextView {
    public static int edgeSize = 100;
    public static int fontSize = 24;

    private boolean state;

    @SuppressLint("SetTextI18n")
    public ParkingSpot(Context context, int pos) {
        super(context);
        setTypeface(null, Typeface.BOLD);
        setTextAlignment(AppCompatTextView.TEXT_ALIGNMENT_CENTER);
        //setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize);
        setText("S" + String.valueOf(pos + 1));
        setFocusable(false);
        setWidth(edgeSize);
        setHeight(edgeSize);
    }

    boolean isFree() {
        return state;
    }

    void setFree(boolean b) {
        state = b;
        if (b) {
            setBackgroundResource(R.color.free_grad_start);
        } else {
            setBackgroundResource(R.color.occ_grad_start);
        }
    }
}