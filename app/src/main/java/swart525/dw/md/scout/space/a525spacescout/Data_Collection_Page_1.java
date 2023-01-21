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
    public static int Team_Num = 0;
    public static String Red1 = "False";
    public boolean flgRed1 = true;
    public static String Red2 = "False";
    public boolean flgRed2 = true;
    public static String Red3 = "False";
    public boolean flgRed3 = true;
    public static String Red4 = "False";
    public boolean flgRed4 = true;
    public static String Red5 = "False";
    public boolean flgRed5 = true;
    public static String Red6 = "False";
    public boolean flgRed6 = true;
 //   public static String RedOther = "False";
    public static String Blue1 = "False";
    public boolean flgBlue1 = true;
    public static String Blue2 = "False";
    public boolean flgBlue2 = true;
    public static String Blue3 = "False";
    public boolean flgBlue3 = true;
    public static String Blue4 = "False";
    public boolean flgBlue4 = true;
    public static String Blue5 = "False";
    public boolean flgBlue5 = true;
    public static String Blue6 = "False";
    public boolean flgBlue6 = true;
 //   public static String BlueOther = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int Compare_Match_Num = 150; //Match must be less than 150
        final int Compare_Team_Num = 1; //Team must be greater than 1

        //Defines text boxes for Match/Team Number
        //final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_Txt);
        final EditText Team_Num_txt = (EditText) findViewById(R.id.Team_Num_txt);
        //final EditText Initials_txt = (EditText) findViewById(R.id.Init_Txt);

        //Defines all RadioButtons for positions
        final Button Red1CB = (Button) findViewById(R.id.Red1_B);
        final Button Red2CB = (Button) findViewById(R.id.Red2_B);
        final Button Red3CB = (Button) findViewById(R.id.Red3_B);
        final Button Red4CB = (Button) findViewById(R.id.Red4_B);
        final Button Red5CB = (Button) findViewById(R.id.Red5_B);
        final Button Red6CB = (Button) findViewById(R.id.Red6_B);
      //  final Button RedOtherCB = (Button) findViewById(R.id.Red_Other_B);
        final Button Blue1CB = (Button) findViewById(R.id.Blue1_B);
        final Button Blue2CB = (Button) findViewById(R.id.Blue2_B);
        final Button Blue3CB = (Button) findViewById(R.id.Blue3_B);
        final Button Blue4CB = (Button) findViewById(R.id.Blue4_B);
        final Button Blue5CB = (Button) findViewById(R.id.Blue5_B);
        final Button Blue6CB = (Button) findViewById(R.id.Blue6_B);
      //  final Button BlueOtherCB = (Button) findViewById(R.id.Blue_Other_CB);

        //Clicking Buttons while on page 1

        //Button Red1CB = findViewById(R.id.Red1_B);
        //Toggle the colors of the button when it is touched
        Red1CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgRed1) {
                    Red1CB.setBackgroundResource(R.color.button_yes_red);
                    flgRed1 = false;
                    Red1 = "True";
                }else{
                    Red1CB.setBackgroundResource(R.color.button_no);
                    flgRed1 = true;
                    Red1 = "False";
                }
            }
        });

        Red2CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgRed2) {
                    Red2CB.setBackgroundResource(R.color.button_yes_red);
                    flgRed2 = false;
                    Red2 = "True";
                }else{
                    Red2CB.setBackgroundResource(R.color.button_no);
                    flgRed2 = true;
                    Red3 = "False";

                }
            }
        });

        Red3CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgRed3) {
                    Red3CB.setBackgroundResource(R.color.button_yes_red);
                    flgRed3 = false;
                    Red3 = "True";
                }else{
                    Red3CB.setBackgroundResource(R.color.button_no);
                    flgRed3 = true;
                    Red3 = "False";
                }
            }
        });

        Red4CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgRed4) {
                    Red4CB.setBackgroundResource(R.color.button_yes_red);
                    flgRed4 = false;
                    Red4 = "True";
                }else{
                    Red4CB.setBackgroundResource(R.color.button_no);
                    flgRed4 = true;
                    Red4 = "False";
                }
            }
        });

        Red5CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgRed5) {
                    Red5CB.setBackgroundResource(R.color.button_yes_red);
                    flgRed5 = false;
                    Red5 = "True";
                }else{
                    Red5CB.setBackgroundResource(R.color.button_no);
                    flgRed5 = true;
                    Red5 = "False";
                }
            }
        });

        Red6CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgRed6) {
                    Red6CB.setBackgroundResource(R.color.button_yes_red);
                    flgRed6 = false;
                    Red6 = "True";
                }else{
                    Red6CB.setBackgroundResource(R.color.button_no);
                    flgRed6 = true;
                    Red6 = "False";
                }
            }
        });

        Blue1CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgBlue1) {
                    Blue1CB.setBackgroundResource(R.color.button_yes_blue);
                    flgBlue1 = false;
                    Blue1 = "True";
                }else{
                    Blue1CB.setBackgroundResource(R.color.button_no);
                    flgBlue1 = true;
                    Blue1 = "False";
                }
            }
        });

        Blue2CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgBlue2) {
                    Blue2CB.setBackgroundResource(R.color.button_yes_blue);
                    flgBlue2 = false;
                    Blue2 = "True";
                }else{
                    Blue2CB.setBackgroundResource(R.color.button_no);
                    flgBlue2 = true;
                    Blue2 = "False";
                }
            }
        });

        Blue3CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgBlue3) {
                    Blue3CB.setBackgroundResource(R.color.button_yes_blue);
                    flgBlue3 = false;
                    Blue3 = "True";
                }else{
                    Blue3CB.setBackgroundResource(R.color.button_no);
                    flgBlue3 = true;
                    Blue3 = "False";
                }
            }
        });

        Blue4CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgBlue4) {
                    Blue4CB.setBackgroundResource(R.color.button_yes_blue);
                    flgBlue4 = false;
                    Blue4 = "True";
                }else{
                    Blue4CB.setBackgroundResource(R.color.button_no);
                    flgBlue4 = true;
                    Blue4 = "False";
                }
            }
        });
        Blue5CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgBlue5) {
                    Blue5CB.setBackgroundResource(R.color.button_yes_blue);
                    flgBlue5 = false;
                    Blue5 = "True";
                }else{
                    Blue5CB.setBackgroundResource(R.color.button_no);
                    flgBlue5 = true;
                    Blue5 = "False";
                }
            }
        });

        Blue6CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                if(flgBlue6) {
                    Blue6CB.setBackgroundResource(R.color.button_yes_blue);
                    flgBlue6 = false;
                    Blue6 = "True";
                }else{
                    Blue6CB.setBackgroundResource(R.color.button_no);
                    flgBlue6 = true;
                    Blue6 = "False";
                }
            }
        });



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
                if(Team_Num_txt.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter Team Number!", Toast.LENGTH_LONG).show();
                }else{
                    int Team_Num_Real = Integer.parseInt(Team_Num_txt.getText().toString());
                        if(Compare_Team_Num < Team_Num_Real){
                            Team_Num = Integer.parseInt(Team_Num_txt.getText().toString()); //Sets team num data to txt box information

                            Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                            startActivity(startintent);
                        }else{
                            Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                        }
                    }

            }
        });
    }
}
