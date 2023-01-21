package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String GenpitCubes = "False";
    public static String GenpitCones = "False";
    public static String GenpitSubstation = "False";
    public static String GenpitGround = "False";
    public static String GenpitSideways = "False";
    public static String GenpitRightSideUp = "False";
    public static String GenpitCanDock = "False";
    public static String GenpitCanEngage = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all checkboxes for positions
        final CheckBox GenpitCubesCB = (CheckBox) findViewById(R.id.Genpit_Cubes_CB);
        final CheckBox GenpitConesCB = (CheckBox) findViewById(R.id.Genpit_Cones_CB);

        final CheckBox GenpitSubstationCB = (CheckBox) findViewById(R.id.Genpit_Substation_CB);
        final CheckBox GenpitGroundCB = (CheckBox) findViewById(R.id.Genpit_Ground_CB);
        final CheckBox GenpitSidewaysCB = (CheckBox) findViewById(R.id.Genpit_Sideways_CB);
        final CheckBox GenpitRightSideUpCB = (CheckBox) findViewById(R.id.Genpit_RightSideUp_CB);

        final CheckBox GenpitCanDockCB = (CheckBox) findViewById(R.id.Genpit_CanDock_CB);
        final CheckBox GenpitCanEngageCB = (CheckBox) findViewById(R.id.Genpit_CanEngage_CB);

        //Defines and implements Button to continue along with variable savings
        Button To_Teleop = (Button) findViewById(R.id.To_Teleop);
        To_Teleop.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {



                /*add in data collection pieces from checkboxes*/
                if (GenpitCubesCB.isChecked()) {
                    GenpitCubes = "True";
                }
                if (GenpitConesCB.isChecked()) {
                    GenpitCones = "True";
                }


                if (GenpitSubstationCB.isChecked()) {
                    GenpitSubstation = "True";
                }
                if (GenpitGroundCB.isChecked()) {
                    GenpitGround = "True";
                }
                if (GenpitSidewaysCB.isChecked()) {
                    GenpitSideways = "True";
                }
                if (GenpitRightSideUpCB.isChecked()) {
                    GenpitRightSideUp = "True";
                }


                if (GenpitCanDockCB.isChecked()) {
                    GenpitCanDock = "True";
                }
                if (GenpitCanEngageCB.isChecked()) {
                    GenpitCanEngage = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                startActivity(startintent);
            }
        });

    }

}
