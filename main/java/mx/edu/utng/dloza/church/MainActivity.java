package mx.edu.utng.dloza.church;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void new1(View v){

        //Usar la clase Intent para poder lanzar otro Activity
        Intent intent = new Intent(MainActivity.this, ChurchActivity.class);
        startActivity(intent);
    }
}
