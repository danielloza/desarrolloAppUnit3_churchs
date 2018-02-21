package mx.edu.utng.dloza.church;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void new3(View v){

        //Usar la clase Intent para poder lanzar otro Activity
        Intent intent = new Intent(MapActivity.this, MapActivity.class);
        startActivity(intent);
    }
}
