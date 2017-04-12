package pl.krzysztofsikora.soundboard;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] activities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        initResources();
        initActivitiesListView();


    }

    private void initResources() {
        Resources resources = getResources();
        activities = resources.getStringArray(R.array.activities);
    }

    private void initActivitiesListView() {
//        listView.setAdapter(new ArrayAdapter<String>(
//                getApplicationContext(),
//                android.R.layout.simple_list_item_1,
//                activities
//        ));


        /* set color list view */
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, activities){

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);

                TextView textView=(TextView) view.findViewById(android.R.id.text1);

            /*YOUR CHOICE OF COLOR*/
                textView.setTextColor(getResources().getColor(R.color.customWhite));
                textView.setBackgroundColor(getResources().getColor(R.color.customAccent));
                return view;
            }
        };


        listView.setAdapter(adapter);
        listView.setBackgroundColor(getResources().getColor(R.color.customPrimary));



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {





            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                click(position);
            }






        });
    }


    public void dialog(int number) {


        final CharSequence[] items = { "Take Photo", "Choose from Library",
                "Cancel" };
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("What you want to do? Your position is: " + number);
        builder.setItems(items, new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int item) {
                if (items[item].equals("Take Photo")) {
//                    // Opens Camera to take a picture
//                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                    startActivityForResult(intent, REQUEST_CAMERA);
                }
                else if (items[item].equals("Choose from Library")) {
//                    // Opens the galary to choose image
//                    Intent intent = new Intent(
//                            Intent.ACTION_PICK,
//                            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                    intent.setType("image/*");
//                    startActivityForResult(
//                            Intent.createChooser(intent,"Select File"),
//                            SELECT_FILE);
                }
                else if (items[item].equals("Cancel")) {

                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    public void click(int pos) {

//        Intent intent;


        switch (pos) {

            case 0:
//                intent = new Intent(MainActivity.this, SoundActivity.class);
                dialog(0);
                break;
            case 1:
//                intent = new Intent(MainActivity.this, SoundActivity.class);
                dialog(1);
                break;
            case 2:
//                intent = new Intent(MainActivity.this, SoundActivity.class);
                dialog(2);
                break;
            case 3:
//                intent = new Intent(MainActivity.this, SoundActivity.class);
                dialog(3);
                break;
            case 4:
//                intent = new Intent(MainActivity.this, SoundActivity.class);
                dialog(4);
                break;
            case 5:
//                intent = new Intent(MainActivity.this, SoundActivity.class);
                dialog(5);
                break;
            default:
//                intent = new Intent(MainActivity.this, SoundActivity.class);
                dialog(6);
                break;

        }
//        startActivity(intent);
    }
}
