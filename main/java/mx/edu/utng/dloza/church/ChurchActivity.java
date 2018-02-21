package mx.edu.utng.dloza.church;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChurchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church);
    }

    public void new2(View v){

        //Usar la clase Intent para poder lanzar otro Activity
        Intent intent = new Intent(ChurchActivity.this, MapActivity.class);
        startActivity(intent);
    }
}
