package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;




public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines Variables for Match/Team Number
    public static int GenTeamNum = 0;
    public static String GenCubes = "False";
    public static String GenCones = "False";
    public static String GenSubstation = "False";
    public static String GenGround = "False";
    public static String GenSideways = "False";
    public static String GenRightSideUp = "False";
    public static String GenCanDock = "False";
    public static String GenCanEngage = "False";
    //   public static String BlueOther = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int CompareTeamNum = 1; //Team must be greater than 1


        //final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_Txt);
        final EditText GenTeamNumTXT = (EditText) findViewById(R.id.Gen_TeamNum_TXT);
        //final EditText Initials_txt = (EditText) findViewById(R.id.Init_Txt);

        //Defines all Checkboxes
        final CheckBox GenCubesCB = (CheckBox) findViewById(R.id.Gen_Cubes_CB);
        final CheckBox GenConesCB = (CheckBox) findViewById(R.id.Gen_Cones_CB);

        final CheckBox GenSubstationCB = (CheckBox) findViewById(R.id.Gen_Substation_CB);
        final CheckBox GenGroundCB = (CheckBox) findViewById(R.id.Gen_Ground_CB);
        final CheckBox GenSidewaysCB = (CheckBox) findViewById(R.id.Gen_Sideways_CB);
        final CheckBox GenRightSideUpCB = (CheckBox) findViewById(R.id.Gen_RightSideUp_CB);

        final CheckBox GenCanDockCB = (CheckBox) findViewById(R.id.Gen_CanDock_CB);
        final CheckBox GenCanEngageCB = (CheckBox) findViewById(R.id.Gen_CanEngage_CB);

        //Defines all RadioButtons for positions

      //  final Button RedOtherCB = (Button) findViewById(R.id.Red_Other_B);

      //  final Button BlueOtherCB = (Button) findViewById(R.id.Blue_Other_CB);

        //Clicking Buttons while on page 1

        //Button Red1CB = findViewById(R.id.Red1_B);
        //Toggle the colors of the button when it is touched
        //Red1CB.setOnClickListener(new View.OnClickListener() {
            //@Override
           //public void onClick(View v) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                //if(flgRed1) {
                    //Red1CB.setBackgroundResource(R.color.button_yes_red);
                    //flgRed1 = false;
                    //Red1 = "True";
                //}else{
                    //Red1CB.setBackgroundResource(R.color.button_no);
                    //flgRed1 = true;
                    //Red1 = "False";
                //}
            //}
        //});


        //Defines button needed and actions to cancel a data collection
        Button Cancel_Collection = (Button) findViewById(R.id.Cancel_Collection_B);
        Cancel_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });
        //Defines Start button and takes to next page as well as recording data
        Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
        Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                if(GenTeamNumTXT.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter Team Number!", Toast.LENGTH_LONG).show();
                }
                else
                {int Team_Num_Real = Integer.parseInt(GenTeamNumTXT.getText().toString());
                        if(CompareTeamNum < Team_Num_Real) {
                            GenTeamNum = Integer.parseInt(GenTeamNumTXT.getText().toString()); //Sets team num data to txt box information

                            Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                            startActivity(startintent);
                            }
                        else {
                            Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                        }
                    }
                if (GenCubesCB.isChecked()) {
                    GenCubes = "True";
                }
                if (GenConesCB.isChecked()) {
                    GenCones = "True";
                }
                if (GenSubstationCB.isChecked()) {
                    GenSubstation = "True";
                }
                if (GenGroundCB.isChecked()) {
                    GenGround = "True";
                }
                if (GenSidewaysCB.isChecked()) {
                    GenSideways = "True";
                }
                if (GenRightSideUpCB.isChecked()) {
                    GenRightSideUp = "True";
                }
                if (GenCanDockCB.isChecked()) {
                    GenCanDock = "True";
                }
                if (GenCanEngageCB.isChecked()) {
                    GenCanEngage = "True";
                }
            }
        });
    }
}
