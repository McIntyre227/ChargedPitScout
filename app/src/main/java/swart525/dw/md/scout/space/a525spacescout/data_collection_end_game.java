package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables

    public static String TraversalCap = "False";
    public static String HighCap = "False";
    public static String MidCap = "False";
    public static String LowCap = "False";
    public static String TraversalPref = "False";
    public static String HighPref = "False";
    public static String MidPref = "False";
    public static String LowPref = "False";
    public static String NoHang = "False";
    public static String HangSpeed = "None";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements

        final CheckBox TraversalCapCB = (CheckBox) findViewById(R.id.Traversal_Cap_CB);
        final CheckBox HighCapCB = (CheckBox) findViewById(R.id.High_Cap_CB);
        final CheckBox MidCapCB = (CheckBox) findViewById(R.id.Mid_Cap_CB);
        final CheckBox LowCapCB = (CheckBox) findViewById(R.id.Low_Cap_CB);
        final CheckBox NoHangCB = (CheckBox) findViewById(R.id.No_Hang_CB);

        final CheckBox TraversalPrefCB = (CheckBox) findViewById(R.id.Traversal_Pref_CB);
        final CheckBox HighPrefCB = (CheckBox) findViewById(R.id.High_Pref_CB);
        final CheckBox MidPrefCB = (CheckBox) findViewById(R.id.Mid_Pref_CB);
        final CheckBox LowPrefCB = (CheckBox) findViewById(R.id.Low_Pref_CB);

        final EditText HangSpeedtxt = (EditText) findViewById(R.id.Hang_Speed_txt);


        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                HangSpeed = HangSpeedtxt.getText().toString();

                if (TraversalCapCB.isChecked()) {
                    TraversalCap = "True";
                }
                if (HighCapCB.isChecked()) {
                    HighCap = "True";
                }
                if (MidCapCB.isChecked()) {
                    MidCap = "True";
                }
                if (LowCapCB.isChecked()) {
                    LowCap = "True";
                }
                if (TraversalPrefCB.isChecked()) {
                    TraversalPref = "True";
                }
                if (HighPrefCB.isChecked()) {
                    HighPref = "True";
                }
                if (MidPrefCB.isChecked()) {
                    MidPref = "True";
                }
                if (LowPrefCB.isChecked()) {
                    LowPref = "True";
                }
                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                if (NoHangCB.isChecked()) {
                    NoHang = "True";
                }


                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });


    }

}


