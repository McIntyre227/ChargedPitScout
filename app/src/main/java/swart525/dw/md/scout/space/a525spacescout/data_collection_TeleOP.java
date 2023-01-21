package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection


    public static String AutopitMobility = "False";

    public static String AutopitCubes = "False";
    public static String AutopitCones = "False";

    public static String AutopitTop = "False";
    public static String AutopitMiddle = "False";
    public static String AutopitBottom = "False";

    public static String AutopitColorReliance = "False";

    public static String AutopitCubes1 = "False";
    public static String AutopitCubes2 = "False";
    public static String AutopitCubes3 = "False";
    public static String AutopitCones1 = "False";
    public static String AutopitCones2 = "False";
    public static String AutopitCones3 = "False";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        //Defines all checkboxes;
        final CheckBox AutopitMobilityCB = (CheckBox) findViewById(R.id.Autopit_Mobility_CB);

        final CheckBox AutopitCubesCB = (CheckBox) findViewById(R.id.Autopit_Cubes_CB);
        final CheckBox AutopitConesCB = (CheckBox) findViewById(R.id.Autopit_Cones_CB);

        final CheckBox AutopitTopCB = (CheckBox) findViewById(R.id.Autopit_Top_CB);
        final CheckBox AutopitMiddleCB = (CheckBox) findViewById(R.id.Autopit_Middle_CB);
        final CheckBox AutopitBottomCB = (CheckBox) findViewById(R.id.Autopit_Bottom_CB);

        final CheckBox AutopitColorRelianceCB = (CheckBox) findViewById(R.id.Autopit_ColorReliance_CB);

        final CheckBox AutopitCubes1CB = (CheckBox) findViewById(R.id.Autopit_Cubes1_CB);
        final CheckBox AutopitCubes2CB = (CheckBox) findViewById(R.id.Autopit_Cubes2_CB);
        final CheckBox AutopitCubes3CB = (CheckBox) findViewById(R.id.Autopit_Cubes3_Cb);
        final CheckBox AutopitCones1CB = (CheckBox) findViewById(R.id.Autopit_Cones1_CB);
        final CheckBox AutopitCones2CB = (CheckBox) findViewById(R.id.Autopit_Cones2_CB);
        final CheckBox AutopitCones3CB = (CheckBox) findViewById(R.id.Autopit_Cones3_CB);



        //Defines all text boxes
        //final EditText CargoStrategytxt = (EditText) findViewById(R.id.Cargo_Strategy_txt);



        //Below defines the button and commands for saving data and switching pages
        Button To_EndGame = (Button) findViewById(R.id.To_Endgame_B);
        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
           public void onClick(View v) {

                if (AutopitMobilityCB.isChecked()) {
                    AutopitMobility = "True";
                }

                if (AutopitCubesCB.isChecked()) {
                    AutopitCubes = "True";
                }
                if (AutopitConesCB.isChecked()) {
                    AutopitCones = "True";
                }

                if (AutopitTopCB.isChecked()) {
                    AutopitTop = "True";
                }
                if (AutopitMiddleCB.isChecked()) {
                    AutopitMiddle = "True";
                }
                if(AutopitBottomCB.isChecked()){
                    AutopitBottom = "True";
                }

                if(AutopitColorRelianceCB.isChecked()){
                    AutopitColorReliance = "True";
                }


                    Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    startActivity(startintent);
                }

        });

    }
}
