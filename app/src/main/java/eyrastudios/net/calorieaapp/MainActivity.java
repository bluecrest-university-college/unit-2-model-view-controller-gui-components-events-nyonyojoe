package eyrastudios.net.calorieaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import android.app.Activity;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView results;

    int results_num;
    CheckBox push,bar,ski,jog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickListener checkboxlistener = new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    String nameofboolean = "is" + v.toString();

                }

            }
        };
        results_num=0;

        results = (TextView) findViewById(R.id.resultsID);

        push = (CheckBox) findViewById(R.id.PushUpsID);
        bar = (CheckBox) findViewById(R.id.BarBellsID);
        ski = (CheckBox) findViewById(R.id.SkippingID);
        jog = (CheckBox) findViewById(R.id.JoggingID);



        push.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checked
                if (buttonView.isChecked()) {
                    results_num = results_num+10;
                } else
                {
                    // not checked
                    results_num = results_num-10;
                }
                results.setText(String.valueOf(results_num + " Calories"));
            }

        });

        bar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checked
                if (buttonView.isChecked()) {
                    results_num = results_num+40;
                } else
                {
                    // not checked
                    results_num = results_num-40;
                }
                results.setText(String.valueOf(results_num + " Calories"));
            }

        });


        ski.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checked
                if (buttonView.isChecked()) {
                    results_num = results_num+25;
                } else
                {
                    // not checked
                    results_num = results_num-25;
                }
                results.setText(String.valueOf(results_num + " Calories"));
            }

        });

        jog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checked
                if (buttonView.isChecked()) {
                    results_num = results_num+15;
                } else
                {
                    // not checked
                    results_num = results_num-15;
                }
                results.setText(String.valueOf(results_num + " Calories"));
            }

        });


    }

}