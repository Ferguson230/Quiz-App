package com.example.deedat.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private RadioGroup rg1;
    private RadioButton nile;
    private EditText et1;
    private CheckBox kwame;
    private CheckBox mandela;
    private CheckBox chinua;
    private RadioGroup rg2;
    private RadioButton coast;
    private EditText et2;
    private CheckBox spain;
    private CheckBox netherlands;
    private CheckBox germany;
    private RadioGroup rg3;
    private RadioButton dangote;
    private EditText et3;
    private RadioGroup rg4;
    private RadioButton george;
    private EditText et4;
    private Button submit;
    private String str;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1 = (RadioGroup) findViewById(R.id.rg1);
        kwame = (CheckBox) findViewById(R.id.kwame_checkbox);
        mandela = (CheckBox) findViewById(R.id.mandela_checkbox);
        chinua = (CheckBox) findViewById(R.id.chinua_checkbox);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        spain = (CheckBox) findViewById(R.id.spain_checkbox);
        netherlands = (CheckBox) findViewById(R.id.netherlands_checkbox);
        germany = (CheckBox) findViewById(R.id.germany_checkbox);
        rg3 = (RadioGroup) findViewById(R.id.rg3);
        rg4 = (RadioGroup) findViewById(R.id.rg4);
        submit = (Button) findViewById(R.id.sb);





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check Question 1
                int selectedId1 = rg1.getCheckedRadioButtonId();
                if (selectedId1 == -1) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }
                else {
                    nile = (RadioButton) findViewById(selectedId1);
                    if (nile.getId() == R.id.nile_radio_button) {
                        score += 1;
                    }
                }


                //check Question 2
                et1 = (EditText) findViewById(R.id.answer_field);
                str = et1.getText().toString();
                if (str.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }
                else if (str.equals("Nelson Mandela")) {
                    score += 1;
                }


               //check Question 3
                if (!(kwame.isChecked())  && !(chinua.isChecked())) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }

                if (!(mandela.isChecked()) && !(chinua.isChecked())) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }


                else if (kwame.isChecked() && mandela.isChecked() ) {
                    score += 1;
                }


                //check Question 4
                int selectedId2 = rg2.getCheckedRadioButtonId();
                if (selectedId2 == -1) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }

                else {
                    coast = (RadioButton) findViewById(selectedId2);
                    if (coast.getId() == R.id.coast_radio_button) {
                        score += 1;
                    }
                }



                //check Question 5
                et2 = (EditText) findViewById(R.id.highest_answer_field);
                str = et2.getText().toString();
                if (str.equals("")){
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }

                else if (str.equals("Nigeria")) {
                    score += 1;
                }



                //check Question 6
                if (!(spain.isChecked())  && !(germany.isChecked())) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }

                if (!(netherlands.isChecked()) && !(germany.isChecked())) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }


                else if (spain.isChecked() && netherlands.isChecked() ) {
                    score += 1;
                }


                //check Question 7
                int selectedId3 = rg3.getCheckedRadioButtonId();
                if (selectedId3 == -1) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }
                else {
                    dangote = (RadioButton) findViewById(selectedId3);
                    if (dangote.getId() == R.id.dangote_radio_button) {
                        score += 1;
                    }
                }


                //check Question 8
                et3 = (EditText) findViewById(R.id.type_field);
                str = et3.getText().toString();
                if (str.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }
                else if (str.equals("Kofi Annan")) {
                    score += 1;
                }



                //check Question 9
                int selectedId4 = rg4.getCheckedRadioButtonId();
                if (selectedId4 == -1) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }
                else {
                    george = (RadioButton) findViewById(selectedId4);
                    if (george.getId() == R.id.george_radio_button) {
                        score += 1;
                    }
                }



                //check Question 10
                et4 = (EditText) findViewById(R.id.ten_field);
                str = et4.getText().toString();
                if (str.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please answer all questions!", Toast.LENGTH_SHORT).show();
                    score = 0;
                }
                else if (str.equals("Johannesburg")) {
                    score += 1;
                }

                Toast.makeText(getApplicationContext(), "You got " + score + " out of 10 right!", Toast.LENGTH_LONG).show();




            }
        });
    }
}

