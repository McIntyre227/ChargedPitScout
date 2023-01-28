package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String AutoCubes = "False";
    public static String AutoCones = "False";
    public static String AutoMobility = "False";
    public static String AutoTop = "False";
    public static String AutoMiddle = "False";
    public static String AutoBottom = "False";
    public static String AutoCones1 = "False";
    public static String AutoCones2 = "False";
    public static String AutoCones3 = "False";
    public static String AutoCubes1 = "False";
    public static String AutoCubes2 = "False";
    public static String AutoCubes3 = "False";
    public static String AutoColorReliance = "False";
    public static String AutoZone4 = "False";
    public static boolean AutoZ4 = true;
    public static String AutoZone3 = "False";
    public static boolean AutoZ3 = true;
    public static String AutoZone2 = "False";
    public static boolean AutoZ2 = true;
    public static String AutoZone1 = "False";
    public static boolean AutoZ1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all checkboxes for positions
        final CheckBox AutoCubesCB = (CheckBox) findViewById(R.id.Auto_Cubes_CB);
        final CheckBox AutoConesCB = (CheckBox) findViewById(R.id.Auto_Cones_CB);
        final CheckBox AutoMobilityCB = (CheckBox) findViewById(R.id.Auto_Mobility_CB);
        final CheckBox AutoTopCB = (CheckBox) findViewById(R.id.Auto_Top_CB);
        final CheckBox AutoMiddleCB = (CheckBox) findViewById(R.id.Auto_Middle_CB);
        final CheckBox AutoBottomCB = (CheckBox) findViewById(R.id.Auto_Bottom_CB);
        final CheckBox AutoCones1CB = (CheckBox) findViewById(R.id.Auto_Cones1_CB);
        final CheckBox AutoCones2CB = (CheckBox) findViewById(R.id.Auto_Cones2_CB);
        final CheckBox AutoCones3CB = (CheckBox) findViewById(R.id.Auto_Cones3_CB);
        final CheckBox AutoCubes1CB = (CheckBox) findViewById(R.id.Auto_Cubes1_CB);
        final CheckBox AutoCubes2CB = (CheckBox) findViewById(R.id.Auto_Cubes2_CB);
        final CheckBox AutoCubes3CB = (CheckBox) findViewById(R.id.Auto_Cubes3_CB);
        final CheckBox AutoColorRelianceCB = (CheckBox) findViewById(R.id.Auto_ColorReliance_CB);

        //Defines all buttons for locations
        final Button AutoZone1B = findViewById(R.id.Auto_Zone1_B);
        final Button AutoZone2B = findViewById(R.id.Auto_Zone2_B);
        final Button AutoZone3B = findViewById(R.id.Auto_Zone3_B);
        final Button AutoZone4B = findViewById(R.id.Auto_Zone4_B);

        //Defines and implements Button to continue along with variable savings
        final Button To_EndGame_B = (Button) findViewById(R.id.To_EndGame_B);

        AutoZone1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AutoZ1) {
                    AutoZone1B.setBackgroundResource(R.color.button_yes_blue);
                    AutoZone1 = "True";
                    AutoZ1 = false;
                }
                else {
                    AutoZone1B.setBackgroundResource(R.color.button_no);
                    AutoZone1 = "False";
                    AutoZ1 = true;
                }

            }
        });

        AutoZone2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AutoZ2) {
                    AutoZone2B.setBackgroundResource(R.color.button_yes_blue);
                    AutoZone2 = "True";
                    AutoZ2 = false;
                }
                else {
                    AutoZone2B.setBackgroundResource(R.color.button_no);
                    AutoZone2 = "False";
                    AutoZ2 = true;
                }

            }
        });
        AutoZone3B.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(AutoZ3) {
                    AutoZone3B.setBackgroundResource(R.color.button_yes_blue);
                    AutoZone3 = "True";
                    AutoZ3 = false;
                }
                else {
                    AutoZone3B.setBackgroundResource(R.color.button_no);
                    AutoZone3 = "False";
                    AutoZ3 = true;
                }

            }
        });

        AutoZone4B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AutoZ4) {
                    AutoZone4B.setBackgroundResource(R.color.button_yes_blue);
                    AutoZone4 = "True";
                    AutoZ4 = false;
                }
                else {
                    AutoZone4B.setBackgroundResource(R.color.button_no);
                    AutoZone4 = "False";
                    AutoZ4 = true;
                }

            }
        });

        To_EndGame_B.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                /*add in data collection pieces from checkboxes*/
                if (AutoConesCB.isChecked()) {
                    AutoCones = "True";
                }
                if (AutoCubesCB.isChecked()) {
                    AutoCubes = "True";
                }
                if (AutoMobilityCB.isChecked()) {
                    AutoMobility = "True";
                }
                if (AutoTopCB.isChecked()) {
                    AutoTop = "True";
                }
                if (AutoMiddleCB.isChecked()) {
                    AutoMiddle = "True";
                }
                if (AutoBottomCB.isChecked()) {
                    AutoBottom = "True";
                }
                if (AutoCones1CB.isChecked()) {
                    AutoCones1 = "True";
                }
                if (AutoCones2CB.isChecked()) {
                    AutoCones2 = "True";
                }
                if (AutoCones3CB.isChecked()) {
                    AutoCones3 = "True";
                }
                if (AutoCubes1CB.isChecked()) {
                    AutoCubes1 = "True";
                }
                if (AutoCubes2CB.isChecked()) {
                    AutoCubes2 = "True";
                }
                if (AutoCubes3CB.isChecked()) {
                    AutoCubes3 = "True";
                }
                if (AutoColorRelianceCB.isChecked()) {
                    AutoColorReliance = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                startActivity(startintent);
            }
        });

    }

}
