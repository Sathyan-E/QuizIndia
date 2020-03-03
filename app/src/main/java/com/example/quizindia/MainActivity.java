package com.example.quizindia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText answer1;
    RadioButton answer2,answer3,answer4,answer5;
    CheckBox answer6a,answer6b,option6c,option6d;
    RadioGroup radioGroup2,radioGroup3,radioGroup4,radioGroup5;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding Views of RadioButtons
        //Each question has one answer
        answer1=(EditText)findViewById(R.id.answer1);
        answer2=(RadioButton)findViewById(R.id.answer2);
        answer3=(RadioButton)findViewById(R.id.answer3);
        answer4=(RadioButton)findViewById(R.id.answer4);
        answer5=(RadioButton)findViewById(R.id.answer5);
        //Binding checkboxes for 6 question which has 2 answers.
        answer6a=(CheckBox)findViewById(R.id.answer6a);
        answer6b=(CheckBox)findViewById(R.id.answer6b);
        option6c=(CheckBox)findViewById(R.id.option61);
        option6d=(CheckBox)findViewById(R.id.option62);
        //binding RadioGroups
        radioGroup2=(RadioGroup)findViewById(R.id.radiogroup2);
        radioGroup3=(RadioGroup)findViewById(R.id.radiogroup3);
        radioGroup4=(RadioGroup)findViewById(R.id.radiogroup4);
        radioGroup5=(RadioGroup)findViewById(R.id.radiogroup5);
    }

    /**
     * To calculate the user's score when submit button clicked.
     *
     * @param view
     */
    public void checkScore(View view) {
        checkAnswer1();
        checkAnswer2();
        checkAnswer3();
        checkAnswer4();
        checkAnswer5();
        checkAnswer6();
        Toast.makeText(this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
        scoreReset();

    }

    /**
     * To find whether user answered correctly or not for the first question.If he answered it correctly ,
     * increase the score by one
     */
    private void checkAnswer1() {
        String primeMinistername=answer1.getText().toString();
        if(primeMinistername.equals("NARENDRA MODI") || primeMinistername.equals("NARENDRAMODI") )
        {
            score+=1;
        }
        else
        {
            answer1.setText("");
        }
    }
    /**
     * To find whether user answered correctly or not for the second question.If he answered it correctly ,
     * increase the score by one
     */
    private void checkAnswer2() {
        if (answer2.isChecked())
        {
            score+=1;
        }
        else
        {
            int radioid= radioGroup2.getCheckedRadioButtonId();

            if(radioid>=0)
            {
                RadioButton radioButton=(RadioButton)findViewById(radioid);
                radioButton.setChecked(false);
            }

        }
    }
    /**
     * To find whether user answered correctly or not for the third question.If he answered it correctly ,
     * increase the score by one
     */
    private void checkAnswer3() {
        if (answer3.isChecked())
        {
            score+=1;
        }
        else
        {
            int radioid= radioGroup3.getCheckedRadioButtonId();
            if(radioid>=0)
            {
                RadioButton radioButton=(RadioButton)findViewById(radioid);
                radioButton.setChecked(false);
            }
        }
    }
    /**
     * To find whether user answered correctly or not for the fourth question.If he answered it correctly ,
     * increase the score by one
     */
    private void checkAnswer4() {
        if (answer4.isChecked())
        {
            score+=1;
        }
        else
        {
            int radioid= radioGroup4.getCheckedRadioButtonId();
            if(radioid>=0)
            {
                RadioButton radioButton=(RadioButton)findViewById(radioid);
                radioButton.setChecked(false);
            }
        }
    }
    /**
     * To find whether user answered correctly or not for the fifth question.If he answered it correctly ,
     * increase the score by one
     */
    private void checkAnswer5() {
        if (answer5.isChecked())
        {
            score+=1;
        }
        else
        {
            int radioid= radioGroup5.getCheckedRadioButtonId();
            if(radioid>=0)
            {
                RadioButton radioButton=(RadioButton)findViewById(radioid);
                radioButton.setChecked(false);
            }
        }
    }
    /**
     * To find whether user answered correctly or not for the sixth question.If he answered it correctly ,
     * increase the score by one
     */
    private void checkAnswer6() {
        if (answer6a.isChecked() && answer6b.isChecked() && !option6c.isChecked() && !option6d.isChecked())
        {
            score+=1;
        }
        else
        {
            if(option6c.isChecked() && option6d.isChecked()) {
                option6c.setChecked(false);
                option6d.setChecked(false);
            }
        }
    }
    /**
     * After the evaluation, The score varialbe must be resetchanged to 0 for next try.
     */
    private void scoreReset()
    {
        score=0;
    }
}
