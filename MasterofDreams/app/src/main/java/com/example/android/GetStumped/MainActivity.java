package com.example.android.GetStumped;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout rl = findViewById(R.id.quiz_view);

        // Create Question 0 title
        TextView et_question_1 = new TextView(getApplicationContext());
        et_question_1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        et_question_1.setPadding(100, 100, 50, 50);
        et_question_1.setTypeface(Typeface.create("sans-serif-medium", Typeface.NORMAL));
        et_question_1.setTextSize(20);
        rl.addView(et_question_1);

        // Display Question 0
        et_question_1.setText(R.string.question_0_textview);
        final EditText et_0 = new EditText(this);
        et_0.setHint(R.string.enter_something);
        et_0.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        et_0.setPadding(100, 100, 50, 50);


        // Initialize the Layout parameters for question 0
        LinearLayout.LayoutParams lp_0 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lp_0.setMargins(20, 20, 20, 100);

        // Apply the layout parameters for EditText
        et_0.setLayoutParams(lp_0);
        rl.addView(et_0);

        // Initialize a new RadioGroup for question 1
        final RadioGroup rg = new RadioGroup(getApplicationContext());
        rg.setOrientation(RadioGroup.VERTICAL);

        // Initialize the Layout parameters
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lp.setMargins(20, 20, 20, 100);
        lp.gravity = Gravity.TOP;

        // Apply the layout parameters for RadioGroup
        rg.setLayoutParams(lp);


        // Create Question 1
        TextView rb_question_1 = new TextView(getApplicationContext());
        rg.addView(rb_question_1);

        // Create Question 1 RadioGroup

        rb_question_1.setText(R.string.question_1_textview);
        RadioButton rb_question_1_a = new RadioButton(getApplicationContext());
        rb_question_1_a.setId(R.id.answer_1a);
        rb_question_1_a.setText(R.string.answer_1_a);
        rb_question_1_a.setTextColor(Color.BLACK);
        rg.addView(rb_question_1_a);

        RadioButton rb_question_1_b = new RadioButton(getApplicationContext());
        rb_question_1_b.setId(R.id.answer_1b);
        rb_question_1_b.setText(R.string.answer_1_b);
        rb_question_1_b.setTextColor(Color.BLACK);
        rg.addView(rb_question_1_b);

        // add question 1 RadioGroup
        rl.addView(rg);


        // Initialize a new RadioGroup for question 2
        final RadioGroup rg_2 = new RadioGroup(getApplicationContext());
        rg_2.setOrientation(RadioGroup.VERTICAL);

        // Initialize the Layout parameters for question 2
        LinearLayout.LayoutParams lp_2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lp_2.setMargins(20, 20, 20, 100);
        lp_2.gravity = Gravity.TOP;

        // Apply the layout parameters for RadioGroup
        rg_2.setLayoutParams(lp_2);

        // Create Question 2
        TextView rb_question_2 = new TextView(getApplicationContext());
        rg_2.addView(rb_question_2);

        // Create Question 2 RadioGroup
        rb_question_2.setText(R.string.question_2_textview);
        RadioButton rb_question_2_a = new RadioButton(getApplicationContext());
        rb_question_2_a.setId(R.id.answer_2a);
        rb_question_2_a.setText(R.string.answer_2_a);
        rb_question_2_a.setTextColor(Color.BLACK);
        rg_2.addView(rb_question_2_a);

        RadioButton rb_question_2_b = new RadioButton(getApplicationContext());
        rb_question_2_b.setId(R.id.answer_2b);
        rb_question_2_b.setText(R.string.answer_2_b);
        rb_question_2_b.setTextColor(Color.BLACK);
        rg_2.addView(rb_question_2_b);

        // add question 2 RadioGroup
        rl.addView(rg_2);


        // Initialize a new RadioGroup for question 3
        final RadioGroup rg_3 = new RadioGroup(getApplicationContext());
        rg_3.setOrientation(RadioGroup.VERTICAL);

        // Initialize the Layout parameters for question 3
        LinearLayout.LayoutParams lp_3 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lp_3.setMargins(20, 20, 20, 100);
        lp_3.gravity = Gravity.TOP;

        // Apply the layout parameters for RadioGroup
        rg_3.setLayoutParams(lp_3);


        // Create Question 3
        TextView rb_question_3 = new TextView(getApplicationContext());
        rg_3.addView(rb_question_3);

        // Create Question 3 RadioGroup
        rb_question_3.setText(R.string.question_3_textview);
        RadioButton rb_question_3_a = new RadioButton(getApplicationContext());
        rb_question_3_a.setId(R.id.answer_3a);
        rb_question_3_a.setText(R.string.answer_3_a);
        rb_question_3_a.setTextColor(Color.BLACK);
        rg_3.addView(rb_question_3_a);

        RadioButton rb_question_3_b = new RadioButton(getApplicationContext());
        rb_question_3_b.setId(R.id.answer_3b);
        rb_question_3_b.setText(R.string.answer_3_b);
        rb_question_3_b.setTextColor(Color.BLACK);
        rg_3.addView(rb_question_3_b);

        // add question 3 RadioGroup
        rl.addView(rg_3);


        // Initialize a new RadioGroup for question 4
        final RadioGroup rg_4 = new RadioGroup(getApplicationContext());
        rg_4.setOrientation(RadioGroup.VERTICAL);

        // Initialize the Layout parameters for question 4
        LinearLayout.LayoutParams lp_4 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lp_4.setMargins(20, 20, 20, 100);
        lp_4.gravity = Gravity.TOP;

        // Apply the layout parameters for RadioGroup
        rg_4.setLayoutParams(lp_4);


        // Create Question 4
        TextView rb_question_4 = new TextView(getApplicationContext());
        rg_4.addView(rb_question_4);

        // Create Question 4 RadioGroup
        rb_question_4.setText(R.string.question_4_textview);
        RadioButton rb_question_4_a = new RadioButton(getApplicationContext());
        rb_question_4_a.setId(R.id.answer_4a);
        rb_question_4_a.setText(R.string.answer_4_a);
        rb_question_4_a.setTextColor(Color.BLACK);
        rg_4.addView(rb_question_4_a);

        RadioButton rb_question_4_b = new RadioButton(getApplicationContext());
        rb_question_4_b.setId(R.id.answer_4b);
        rb_question_4_b.setText(R.string.answer_4_b);
        rb_question_4_b.setTextColor(Color.BLACK);
        rg_4.addView(rb_question_4_b);

        // add question 4 RadioGroup
        rl.addView(rg_4);


        // Initialize a new RadioGroup for question 5
        final RadioGroup rg_5 = new RadioGroup(getApplicationContext());
        rg_5.setOrientation(RadioGroup.VERTICAL);

        // Initialize the Layout parameters for question 5
        LinearLayout.LayoutParams lp_5 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lp_5.setMargins(20, 20, 20, 100);
        lp_5.gravity = Gravity.TOP;

        // Apply the layout parameters for RadioGroup
        rg_5.setLayoutParams(lp_5);

        // Create Question 5
        TextView rb_question_5 = new TextView(getApplicationContext());
        rg_5.addView(rb_question_5);

        // Create Question 5 RadioGroup
        rb_question_5.setText(R.string.question_5_textview);
        RadioButton rb_question_5_a = new RadioButton(getApplicationContext());
        rb_question_5_a.setId(R.id.answer_5a);
        rb_question_5_a.setText(R.string.answer_5_a);
        rb_question_5_a.setTextColor(Color.BLACK);
        rg_5.addView(rb_question_5_a);

        RadioButton rb_question_5_b = new RadioButton(getApplicationContext());
        rb_question_5_b.setId(R.id.answer_5b);
        rb_question_5_b.setText(R.string.answer_5_b);
        rb_question_5_b.setTextColor(Color.BLACK);
        rg_5.addView(rb_question_5_b);

        // add question 5 RadioGroup
        rl.addView(rg_5);

        //Display Question 1 'What number did Jackie Robinson Wear'
        final CheckBox cb_0 = new CheckBox((getApplicationContext()));


        // Initialize the Layout parameters
        LinearLayout.LayoutParams lp_cb = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lp_cb.setMargins(20, 20, 20, 150);
        lp_cb.gravity = Gravity.TOP;

        // Apply the layout parameters for RadioGroup
        cb_0.setLayoutParams(lp_cb);

        // Create Answers Question 6
       final TextView cb_question_1 = new TextView(getApplicationContext());
        rl.addView(cb_question_1);

        cb_question_1.setText(R.string.cb_question_1_textview);
        final CheckBox cb_question_1_a = new CheckBox(getApplicationContext());
        cb_question_1_a.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        cb_question_1_a.setId(R.id.cb_answer_1_a);
        cb_question_1_a.setText(R.string.cb_answer_1_a);
        cb_question_1_a.setTextColor(Color.BLACK);
        cb_question_1_a.setPadding(20, 20, 20, 50);
        rl.addView(cb_question_1_a);


       final CheckBox cb_question_1_b = new CheckBox(getApplicationContext());
        cb_question_1_b.setId(R.id.cb_answer_1_b);
        cb_question_1_b.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        cb_question_1_b.setText(R.string.cb_answer_1_b);
        cb_question_1_b.setTextColor(Color.BLACK);
        cb_question_1_b.setPadding(20, 20, 20, 50);
        rl.addView(cb_question_1_b);

        final CheckBox cb_question_1_c = new CheckBox(getApplicationContext());
        cb_question_1_c.setId(R.id.cb_answer_1_c);
        cb_question_1_c.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        cb_question_1_c.setText(R.string.cb_answer_1_c);
        cb_question_1_c.setTextColor(Color.BLACK);
        cb_question_1_c.setPadding(20, 20, 20, 50);

        rl.addView(cb_question_1_c);


        // Reviews quiz answers
        final CheckBox answer0A = findViewById(R.id.cb_answer_1_a);
        final RadioButton answer1A = findViewById(R.id.answer_1a);
        final RadioButton answer2A = findViewById(R.id.answer_2a);
        final RadioButton answer3A = findViewById(R.id.answer_3a);
        final RadioButton answer4A = findViewById(R.id.answer_4a);
        final RadioButton answer5B = findViewById(R.id.answer_5b);


        // Submit Button

        final Button submit = findViewById(R.id.submit_button);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        params.setMargins(0,250,0,0);
        submit.setLayoutParams(params);

        //Calculate Score
        submit.setOnClickListener(new View.OnClickListener() {

            //@score is the initialized to 0
            int score = 0;


            @Override
            public void onClick(View v) {

                if (answer0A.isChecked()){
                    score +=1;
                }
                if (answer1A.isChecked()) {
                    score += 1;
                }
                if (answer2A.isChecked()) {
                    score += 1;
                }
                if (answer3A.isChecked()) {
                    score += 1;
                }
                if (answer4A.isChecked()) {
                    score += 1;
                }
                if (answer5B.isChecked()) {
                    score += 1;
                }
                Toast.makeText(getApplicationContext(), "Great Job! " + et_0.getText() + "\n Final Score " + score + " out of 6.", Toast.LENGTH_SHORT).show();
                score = 0;
            }
        });


        // Sets all objects as invisible but leaves question one visible

        et_0.setVisibility(View.VISIBLE);

        cb_0.setVisibility(View.GONE);
        cb_question_1.setVisibility(View.GONE);
        cb_question_1_a.setVisibility(View.GONE);
        cb_question_1_b.setVisibility(View.GONE);
        cb_question_1_c.setVisibility(View.GONE);

        rg.setVisibility(View.GONE);

        rg_2.setVisibility(View.GONE);

        rg_3.setVisibility(View.GONE);

        rg_4.setVisibility(View.GONE);

        rg_5.setVisibility(View.GONE);

        submit.setVisibility(View.GONE);

        // Editor Listener action which also will hide the keyboard after clicking enter.
        et_0.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override

            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH ||
                        actionId == EditorInfo.IME_ACTION_DONE ||
                        event != null &&
                                event.getAction() == KeyEvent.ACTION_DOWN &&
                                event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    if (event == null || !event.isShiftPressed()) {
                        // the user is done typing.

                        return true; // consume.
                    }
                }
                rg.setVisibility(View.VISIBLE);
                InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                mgr.hideSoftInputFromWindow(et_0.getWindowToken(), 0);
                return false; // pass on to other listeners.
            }
        });



        answer1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg_2.setVisibility(View.VISIBLE);

            }
        });

        answer2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg_3.setVisibility(View.VISIBLE);

            }
        });

        answer3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg_4.setVisibility(View.VISIBLE);

            }
        });

        answer4A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg_5.setVisibility(View.VISIBLE);

            }
        });


        answer5B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cb_0.setVisibility(View.VISIBLE);
                cb_question_1.setVisibility(View.VISIBLE);
                cb_question_1_a.setVisibility(View.VISIBLE);
                cb_question_1_b.setVisibility(View.VISIBLE);
                cb_question_1_c.setVisibility(View.VISIBLE);

            }
        });

        answer0A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit.setVisibility(View.VISIBLE);
            }
        });
    }
}