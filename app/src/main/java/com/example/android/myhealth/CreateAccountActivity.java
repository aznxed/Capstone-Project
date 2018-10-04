package com.example.android.myhealth;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import butterknife.BindView;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.status) TextView mStatusTextView;
    @BindView(R.id.field_email) EditText mEmailField;
    @BindView(R.id.field_password) EditText mPasswordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);


    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
        if (i == R.id.add_allergy_button) {
            int mYear, mMonth, mDay, mHour, mMinute;
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            Toast.makeText(getApplicationContext(), Integer.toString(dayOfMonth),Toast.LENGTH_SHORT).show();
                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }

        else if (i == R.id.add_medication_button) {

        }

        else if(i == R.id.complete_button){

        }
    }
}
