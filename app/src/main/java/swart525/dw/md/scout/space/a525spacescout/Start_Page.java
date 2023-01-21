package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);
        //WARNING: Anything above this line do not edit

        //Below to dotted line defines the needed button and are used to bring you to data collection start page
        Button Start_Collection_Open = (Button) findViewById(R.id.Start_Collection_Open_B); //Defines button for later use
        Start_Collection_Open.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override


            public void onClick(View v) {
                Data_Collection_Page_1.Red1 = "False";
                Data_Collection_Page_1.Red2 = "False";
                Data_Collection_Page_1.Red3 = "False";
                Data_Collection_Page_1.Red4 = "False";
                Data_Collection_Page_1.Red5 = "False";
                Data_Collection_Page_1.Red6 = "False";
                //Data_Collection_Page_1.RedOther = "False";
                Data_Collection_Page_1.Blue1 = "False";
                Data_Collection_Page_1.Blue2 = "False";
                Data_Collection_Page_1.Blue3 = "False";
                Data_Collection_Page_1.Blue4 = "False";
                Data_Collection_Page_1.Blue5 = "False";
                Data_Collection_Page_1.Blue6 = "False";
                //Data_Collection_Page_1.BlueOther = "False";
                data_Collection_sandstorm.UpperHub = "False";
                data_Collection_sandstorm.LowerHub = "False";
                data_collection_TeleOP.Terminal = "False";
                data_collection_TeleOP.LaunchPad = "False";
                data_collection_TeleOP.Fender = "False";
                data_collection_TeleOP.BackTarmac = "False";
                //data_Collection_sandstorm.HumanPlayerMultiple = "False";

                //data_Collection_sandstorm.BallCountAuto = 0;
                //data_collection_TeleOP.WrongColorYes = "False";
                //data_collection_TeleOP.WrongColorNo = "False";
                data_collection_TeleOP.DefenseYes = "False";
                data_collection_TeleOP.DefenseNo = "False";
                data_collection_end_game.TraversalCap = "False";
                data_collection_end_game.HighCap = "False";
                data_collection_end_game.MidCap = "False";
                data_collection_end_game.LowCap = "False";
                data_collection_end_game.TraversalPref = "False";
                data_collection_end_game.HighPref = "False";
                data_collection_end_game.MidPref = "False";
                data_collection_end_game.LowPref = "False";
                data_collection_end_game.NoHang = "False";
                Intent startintent = new Intent(getApplicationContext(), Data_Collection_Page_1.class);
                startActivity(startintent);
            }

        });
        //----------------------------------------------------------------------------------------------------------------

        /*
        //Below to dotted line defines the needed button and are used to bring you to the instruction page
        Button Instruct_Button = (Button) findViewById(R.id.Instructions);
        Instruct_Button.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Instructions_Page.class);
                startActivity(startintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------
    */
    }
}