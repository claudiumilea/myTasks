package com.etss.lepi.mytasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.app.Activity;

public class TasksMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_main);

        Button exitButton = (Button) findViewById(R.id.btnExit);
        exitButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
                //Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                //homeIntent.addCategory( Intent.CATEGORY_HOME );
                //homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //startActivity(homeIntent);
            }
        });
    }


    @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_tasks_main, menu);
                return true;
            }

            @Override
            public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                    return true;
                }

                return super.onOptionsItemSelected(item);
            }

            public void Tasks(View view) {
                Intent taskList = new Intent(this, taskList.class);
                //Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                taskList.addCategory( Intent.CATEGORY_HOME );
                taskList.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(taskList);
            }



}
