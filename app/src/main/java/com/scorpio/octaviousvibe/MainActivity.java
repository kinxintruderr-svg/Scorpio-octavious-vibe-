package com.scorpio.octaviousvibe;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 40, 40, 40);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("Scorpio Octavious Vibe");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);

        TextView welcome = new TextView(this);
        welcome.setText("Welcome to Scorpio Octavious Vibe");
        welcome.setTextSize(18);
        welcome.setTextColor(Color.DKGRAY);
        welcome.setGravity(Gravity.CENTER);
        welcome.setPadding(0, 30, 0, 0);

        layout.addView(title);
        layout.addView(welcome);

        setContentView(layout);
    }
}
