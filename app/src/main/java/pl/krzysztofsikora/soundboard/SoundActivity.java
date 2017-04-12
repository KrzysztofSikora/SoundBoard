package pl.krzysztofsikora.soundboard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.PopupWindow;




import android.view.Gravity;

import android.widget.Button;
import android.widget.LinearLayout;

import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;


public class SoundActivity extends AppCompatActivity {


    boolean isClicked = true;
    PopupWindow popUpWindow;
    LayoutParams layoutParams;
    LinearLayout mainLayout;
    Button btnClickHere;
    LinearLayout containerLayout;
    TextView tvMsg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_sound);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
