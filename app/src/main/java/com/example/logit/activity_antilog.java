package com.example.logit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class activity_antilog extends AppCompatActivity {

    EditText txtval;
    TextView tresult;
    RadioGroup rg ;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antilog);
        txtval = findViewById(R.id.txtantilog);
        tresult = findViewById(R.id.antilogtxtview);
        rg = findViewById(R.id.antilogrg);

    }

    public void calculate_antilog(View view) {

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
                double res = Math.pow(10,val);
                tresult.setText("= "+res);
            }else {
                double val = Double.parseDouble(txtval.getText().toString());
                double res = Math.pow(2.718281828459045,val);
                tresult.setText("= "+res);
            }

        }
        catch(Exception e)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity_antilog.this);
            builder.setTitle("Warning");
            builder.setIcon(R.drawable.baseline_warning_24);
            builder.setCancelable(true);
            builder.setMessage("You did something really stupid! could you  please enter right values and select the base in case if you haven't.");
            builder.setPositiveButton("Got it", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(activity_antilog.this, "I know you're Smart", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(activity_antilog.this, "Well! Keep in mind next time.", Toast.LENGTH_SHORT).show();
                }
            });
            builder.show();
        }
    }

    public void cleartextforantlog(View view) {
        txtval.setText("");
        tresult.setText("");
    }
}