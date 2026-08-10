package com.scorpio.octaviousvibe;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout root;
    LinearLayout content;

    final int DARK = Color.rgb(5, 8, 22);
    final int BLUE = Color.rgb(35, 130, 255);

    TextView text(String value, int size) {
        TextView t = new TextView(this);
        t.setText(value);
        t.setTextColor(Color.WHITE);
        t.setTextSize(size);
        t.setPadding(18, 14, 18, 14);
        return t;
    }

    Button button(String value) {
        Button b = new Button(this);
        b.setText(value);
        b.setTextColor(Color.WHITE);
        b.setTextSize(14);
        b.setAllCaps(false);
        b.setBackgroundColor(BLUE);
        return b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLogin();
    }

    void createBase() {
        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(DARK);
        setContentView(root);
    }

    void showLogin() {
        createBase();

        TextView logo = text("🦂", 70);
        logo.setGravity(Gravity.CENTER);
        root.addView(logo);

        TextView title = text("SCORPIO OCTAVIOUS VIBE", 26);
        title.setGravity(Gravity.CENTER);
        title.setTypeface(null, Typeface.BOLD);
        root.addView(title);

        TextView subtitle =
                text("Social • Wallet • Payments • Rewards", 15);
        subtitle.setGravity(Gravity.CENTER);
        root.addView(subtitle);

        EditText email = new EditText(this);
        email.setHint("Email");
        email.setTextColor(Color.WHITE);
        email.setHintTextColor(Color.GRAY);
        root.addView(email);

        EditText password = new EditText(this);
        password.setHint("Password");
        password.setTextColor(Color.WHITE);
        password.setHintTextColor(Color.GRAY);
        root.addView(password);

        Button login = button("Log in");
        root.addView(login);

        Button signup = button("Create account");
        root.addView(signup);

        login.setOnClickListener(v -> showHome());
        signup.setOnClickListener(v -> showHome());
    }

    void showHome() {
        createBase();

        TextView header =
                text("🦂  Scorpio Octavious Vibe", 22);
        header.setTypeface(null, Typeface.BOLD);
        root.addView(header);

        ScrollView scroll = new ScrollView(this);

        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);

        scroll.addView(content);

        root.addView(
                scroll,
                new LinearLayout.LayoutParams(
                        -1,
                        0,
                        1
                )
        );

        LinearLayout navigation = new LinearLayout(this);

        String[] pages = {
                "Home",
                "Wallet",
                "Rush Coin",
                "Profile"
        };

        for (String page : pages) {

            Button b = button(page);
            b.setTextSize(11);

            navigation.addView(
                    b,
                    new LinearLayout.LayoutParams(
                            0,
                            70,
                            1
                    )
            );

            b.setOnClickListener(v -> showPage(page));
        }

        root.addView(navigation);

        showPage("Home");
    }

    void clearPage() {
        content.removeAllViews();
    }

    void heading(String value) {
        TextView h = text(value, 25);
        h.setTypeface(null, Typeface.BOLD);
        content.addView(h);
    }

    void showPage(String page) {

        clearPage();
        heading(page);

        if (page.equals("Home")) {

            content.addView(
                    text(
                            "Welcome to Scorpio Octavious Vibe 🦂\n\n" +
                            "Your social, wallet and rewards platform.",
                            18
                    )
            );

            content.addView(button("Photos & Videos"));
            content.addView(button("Likes • Comments • Views"));
            content.addView(button("Friends • Messages"));
            content.addView(button("Boost Ads"));
            content.addView(button("Notifications"));
            content.addView(button("Earn & Rewards"));

        } else if (page.equals("Wallet")) {

            content.addView(
                    text("💳 Scorpio Wallet", 23)
            );

            content.addView(
                    text(
                            "Available Balance\nR 0.00\n\n" +
                            "Pending Balance\nR 0.00\n\n" +
                            "Total Earnings\nR 0.00",
                            18
                    )
            );

            content.addView(button("Account Statement"));
            content.addView(button("Deposits"));
            content.addView(button("Withdrawals"));
            content.addView(button("Transactions"));
            content.addView(button("Payment Details"));
            content.addView(button("Download / Print Statement"));

        } else if (page.equals("Rush Coin")) {

            content.addView(
                    text("🪙 SCORPIO RUSH COIN", 24)
            );

            content.addView(
                    text(
                            "Scorpio Rush Coin\n\n" +
                            "Balance: 0 SRC\n" +
                            "Level: 1\n" +
                            "XP: 0",
                            18
                    )
            );

            content.addView(button("PLAY SCORPIO RUSH"));
            content.addView(button("Daily Missions"));
            content.addView(button("Achievements"));
            content.addView(button("Leaderboard"));
            content.addView(button("Coin Transactions"));
            content.addView(button("Rewards"));

        } else if (page.equals("Profile")) {

            content.addView(
                    text("👤 Profile & Account", 23)
            );

            content.addView(button("Personal Details"));
            content.addView(button("Employment Status"));
            content.addView(button("Business Details"));
            content.addView(button("Staff Management"));

            content.addView(
                    button(
                            "Choose: Self-employed / Employee / " +
                            "Business Owner / Student / Unemployed"
                    )
            );

            content.addView(
                    button(
                            "Staff Role: Owner / Administrator / " +
                            "Finance / Manager / Staff / Viewer"
                    )
            );

            content.addView(button("Settings & Security"));
            content.addView(button("Rules & Terms"));
        }
    }
    }
