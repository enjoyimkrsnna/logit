package com.example.logit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.util.*;
import android.widget.TextView;
import android.widget.Toast;

public class activity_log extends AppCompatActivity {

    EditText txtval;
    TextView tresult;
    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        tresult =findViewById(R.id.txtview);
        txtval = findViewById(R.id.txtvalue);
        rg = findViewById(R.id.rdgroup);


    }

    public void calculate_log(View view) {
        try{
            try {
                int id = rg.getCheckedRadioButtonId();
                rb = findViewById(id);
                
            }catch (Exception e)
            {
                Toast.makeText(this, "Please select log 10 or log e", Toast.LENGTH_SHORT).show();
            }

            if(rb.getText().toString().equals("Log10"))
            {
                double val = Double.parseDouble(txtval.getText().toString());
                double res = Math.log10(val);
                tresult.setText("= "+res);
            }else {
                double val = Double.parseDouble(txtval.getText().toString());
                double res = Math.log(val);
                tresult.setText("= "+res);
            }

        }
        catch(Exception e)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity_log.this);
            builder.setTitle("Warning");
            builder.setIcon(R.drawable.baseline_warning_24);
            builder.setCancelable(true);
            builder.setMessage("You did something really stupid! could you  please enter right values and select the base in case if you haven't.");
            builder.setPositiveButton("Got it", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(activity_log.this, "I know you're Smart", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(activity_log.this, "Well! Keep in mind next time.", Toast.LENGTH_SHORT).show();
                }
            });
            builder.show();


        }
      

    }

    public void cleartext(View view) {
        txtval.setText("");
        tresult.setText("");
    }
}