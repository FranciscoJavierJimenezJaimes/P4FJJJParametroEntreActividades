package franciscojavierjimenezjaimes.edu.tesoem.itics.p4fjjj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AcercaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);

    }
    public  void back (View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
