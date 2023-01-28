package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables
    public static String TopCubesCB = "False";
    public static String MiddleCubesCB = "False";
    public static String BottomCubesCB = "False";
    public static String TopConesCB = "False";
    public static String MiddleConesCB = "False";
    public static String BottomConesCB = "False";
    public static String DefenseCB = "False";
    public static String DockCB = "False";
    public static String EngageCB = "False";
    public static String ParkCB = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements


        final CheckBox TeleTopCubesCB = (CheckBox) findViewById(R.id.Tele_TopCubes_CB);
        final CheckBox TeleMiddleCubesCB = (CheckBox) findViewById(R.id.Tele_MiddleCubes_CB);
        final CheckBox TeleBottomCubesCB = (CheckBox) findViewById(R.id.Tele_BottomCubes_CB);
        final CheckBox TeleDefenceCB = (CheckBox) findViewById(R.id.Tele_Defence_CB);
        final CheckBox TeleTopConesCB = (CheckBox) findViewById(R.id.Tele_TopCones_CB);
        final CheckBox TeleMiddleConesCB = (CheckBox) findViewById(R.id.Tele_MiddleCones_CB);
        final CheckBox TeleBottomConesCB = (CheckBox) findViewById(R.id.Tele_BottomCones_CB);
        final CheckBox EndDockCB = (CheckBox) findViewById(R.id.End_Dock_CB);
        final CheckBox EndEngageCB = (CheckBox) findViewById(R.id.End_Engage_CB);
        final CheckBox EndParkCB = (CheckBox) findViewById(R.id.End_Park_CB);

        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {


                if (TeleTopCubesCB.isChecked()) {
                    TopCubesCB = "True";
                }
                if (TeleMiddleCubesCB.isChecked()) {
                    MiddleCubesCB = "True";
                }
                if (TeleBottomCubesCB.isChecked()) {
                    BottomCubesCB = "True";
                }
                if (TeleDefenceCB.isChecked()) {
                    DefenseCB = "True";
                }
                if (TeleTopConesCB.isChecked()) {
                    TopConesCB = "True";
                }
                if (TeleMiddleConesCB.isChecked()) {
                    MiddleConesCB = "True";
                }
                if (TeleBottomConesCB.isChecked()) {
                    BottomConesCB = "True";
                }
                if (EndDockCB.isChecked()) {
                    DockCB = "True";
                }
                if (EndEngageCB.isChecked()) {
                    EngageCB = "True";
                }
                if (EndParkCB.isChecked()) {
                    ParkCB = "True";
                }

                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                //if (NoHangCB.isChecked()) {
                //    NoHang = "True";
                //}

                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });


    }

}


