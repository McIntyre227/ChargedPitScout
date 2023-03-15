package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String AutoTop = "False";
    public static String AutoMiddle = "False";
    public static String AutoBottom = "False";
    public static String Auto0 = "False";
    public static String Auto1 = "False";
    public static String Auto2 = "False";
    public static String Auto3 = "False";
    public static String AutoEngage = "False";
    public static String AutoAutoBalance = "False";
    public static String TeleScoreTop = "False";
    public static String TeleScoreMiddle = "False";
    public static String TeleScoreBottom = "False";
    public static String TeleEngage = "False";
    public static String TelePark = "False";
    public static String GenCycle = "No Time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        final EditText GenCycleSA = (EditText) findViewById(R.id.Gen_Cycle__SA);

        //Defines all checkboxes for positions
        final CheckBox AutoTopCB = (CheckBox) findViewById(R.id.Auto_Top_CB);
        final CheckBox AutoMiddleCB = (CheckBox) findViewById(R.id.Auto_Middle_CB);
        final CheckBox AutoBottomCB = (CheckBox) findViewById(R.id.Auto_Bottom_CB);
        final CheckBox Auto0CB = (CheckBox) findViewById(R.id.Auto_0_CB);
        final CheckBox Auto1CB = (CheckBox) findViewById(R.id.Auto_1_CB);
        final CheckBox Auto2CB = (CheckBox) findViewById(R.id.Auto_2_CB);
        final CheckBox Auto3CB = (CheckBox) findViewById(R.id.Auto_3_CB);
        final CheckBox AutoEngageCB = (CheckBox) findViewById(R.id.Auto_Engage_CB);
        final CheckBox AutoAutoBalanceCB = (CheckBox) findViewById(R.id.Auto__AutoBalance_CB2);
        final CheckBox TeleScoreTopCB = (CheckBox) findViewById(R.id.Tele_ScoreTop_CB);
        final CheckBox TeleScoreMiddleCB = (CheckBox) findViewById(R.id.Tele_ScoreMiddle_CB);
        final CheckBox TeleScoreBottomCB = (CheckBox) findViewById(R.id.Tele_ScoreBottom_CB);
        final CheckBox TeleEngageCB = (CheckBox) findViewById(R.id.Tele_Engage_CB);
        final CheckBox TeleParkCB = (CheckBox) findViewById(R.id.Tele_Park_CB);

        //Defines and implements Button to continue along with variable savings
        final Button To_End_B = (Button) findViewById(R.id.To_End_B);

        To_End_B.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                {
                    Intent startintent = new Intent(getApplicationContext(), Actual_Submit.class);
                    startActivity(startintent);
                    GenCycle = GenCycleSA.getText().toString();
                }

                /*add in data collection pieces from checkboxes*/
                if (AutoTopCB.isChecked()) {
                    AutoTop = "True";
                }
                if (AutoMiddleCB.isChecked()) {
                    AutoMiddle = "True";
                }
                if (AutoBottomCB.isChecked()) {
                    AutoBottom = "True";
                }
                if (Auto0CB.isChecked()) {
                    Auto0 = "True";
                }
                if (Auto1CB.isChecked()) {
                    Auto1 = "True";
                }
                if (Auto2CB.isChecked()) {
                    Auto2 = "True";
                }
                if (Auto3CB.isChecked()) {
                    Auto3 = "True";
                }
                if (AutoEngageCB.isChecked()) {
                    AutoEngage = "True";
                }
                if (AutoAutoBalanceCB.isChecked()) {
                    AutoAutoBalance = "True";
                }
                if (TeleScoreTopCB.isChecked()) {
                    TeleScoreTop = "True";
                }
                if (TeleScoreMiddleCB.isChecked()) {
                    TeleScoreMiddle = "True";
                }
                if (TeleScoreBottomCB.isChecked()) {
                    TeleScoreBottom = "True";
                }
                if (TeleEngageCB.isChecked()) {
                    TeleEngage = "True";
                }
                if (TeleParkCB.isChecked()) {
                    TelePark = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });

    }

}
