package com.bcgdv.asia.fanmenu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.bcgdv.asia.lib.fanmenu.FanMenuButtons;

public class FanMenuButtons2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fan_menu_buttons2);
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.myFAB);
        final FanMenuButtons sub = (FanMenuButtons) findViewById(R.id.myFABSubmenu);
        if (sub != null) {
            sub.setVisibility(View.VISIBLE);
            fab.setVisibility(View.GONE);
            sub.setOnFanButtonClickListener(new FanMenuButtons.OnFanClickListener() {
                @Override
                public void onFanButtonClicked(int index) {
                    Toast.makeText(FanMenuButtons2Activity.this, "Button Clicked = " + index, Toast.LENGTH_SHORT).show();
                    //sub.setButtonSelected(index);
                }
            });

            if (fab != null) {
                fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sub.toggleShow();
                    }
                });
            }
        }


    }
}
