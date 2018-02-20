
package com.example.android.textswitcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import android.widget.ImageView;

/**
 * This sample shows the use of the {@link android.widget.TextSwitcher} View with animations. A
 * {@link android.widget.TextSwitcher} is a special type of {@link android.widget.ViewSwitcher} that animates
 * the current text out and new text in when
 * {@link android.widget.TextSwitcher#setText(CharSequence)} is called.
 */
public class MainActivity extends Activity {
    private TextSwitcher mSwitcher;
    private int mCounter=0;
    private Button nextButton;
    private Button backButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_main);

        // Get the TextSwitcher view from the layout
        mSwitcher = findViewById(R.id.switcher);

        // BEGIN_INCLUDE(setup)
        // Set the factory used to create TextViews to switch between.
        mSwitcher.setFactory(mFactory);

        /*
         * Set the in and out animations. Using the fade_in/out animations
         * provided by the framework.
         */
        Animation in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        mSwitcher.setInAnimation(in);
        mSwitcher.setOutAnimation(out);
        // END_INCLUDE(setup)

        /*
         * Setup the 'next' button. The counter is incremented when clicked and
         * the new value is displayed in the TextSwitcher. The change of text is
         * automatically animated using the in/out animations set above.
         */
        nextButton = findViewById(R.id.b1);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mCounter++;
                // BEGIN_INCLUDE(settext)

                if (mCounter == 1) {
                    mSwitcher.setText("Mercury ดาวพุธ");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.a);
                } else if (mCounter == 2) {
                    mSwitcher.setText("Venus ดาวศุกร์");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.b);
                } else if (mCounter == 3) {
                    mSwitcher.setText("Eath โลก");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.c);
                } else if (mCounter == 4) {
                    mSwitcher.setText("Mars ดาวอังคาร");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.d);
                } else if (mCounter == 5) {
                    mSwitcher.setText("อ่าวโล๊ะซามะ");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.e);
                } else if (mCounter == 6) {
                    mSwitcher.setText("Suturn ดาวเสาร์");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.f);
                } else if (mCounter == 7) {
                    mSwitcher.setText("Uranus ดาวยูเรนัส");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.g);
                } else if (mCounter == 8) {
                    mSwitcher.setText("Neptune ดาวเนปจูน");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.h);
                }
                // mSwitcher.setText("asdasdasdasdasdasd");
                //mSwitcher.setText("4552");
                // END_INCLUDE(settext)
            }
        });

        backButton = findViewById(R.id.b2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter--;

                if (mCounter == 1) {
                    mSwitcher.setText("Mercury ดาวพุธ");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.a);
                } else if (mCounter == 2) {
                    mSwitcher.setText("Venus ดาวศุกร์");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.b);
                } else if (mCounter == 3) {
                    mSwitcher.setText("Eath โลก");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.c);
                } else if (mCounter == 4) {
                    mSwitcher.setText("Mars ดาวอังคาร");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.d);
                } else if (mCounter == 5) {
                    mSwitcher.setText("Jupiter ดาวพฤหัสบดี");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.e);
                } else if (mCounter == 6) {
                    mSwitcher.setText("Suturn ดาวเสาร์");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.f);
                } else if (mCounter == 7) {
                    mSwitcher.setText("Uranus ดาวยูเรนัส");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.g);
                } else if (mCounter == 8) {
                    mSwitcher.setText("Neptune ดาวเนปจูน");
                    imageView = (ImageView) findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.h);
                }
                // mSwitcher.setText("asdasdasdasdasdasd");
                //mSwitcher.setText("4552");
                // END_INCLUDE(settext)
            }
        });



        // Set the initial text without an animation
        // mSwitcher.setCurrentText(String.valueOf(mCounter));

    }

    // BEGIN_INCLUDE(factory)
    /**
     * The {@link android.widget.ViewSwitcher.ViewFactory} used to create {@link android.widget.TextView}s that the
     * {@link android.widget.TextSwitcher} will switch between.
     */
    private ViewFactory mFactory = new ViewFactory() {

        @Override
        public View makeView() {

            // Create a new TextView
            TextView t = new TextView(MainActivity.this);
            t.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
            t.setTextAppearance(MainActivity.this, android.R.style.TextAppearance_Large);
            return t;
        }
    };
    // END_INCLUDE(factory)
}

