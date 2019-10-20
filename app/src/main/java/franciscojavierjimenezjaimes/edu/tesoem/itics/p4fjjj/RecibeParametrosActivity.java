package franciscojavierjimenezjaimes.edu.tesoem.itics.p4fjjj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecibeParametrosActivity extends AppCompatActivity {
    TextView vnombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_parametros);
        vnombre = findViewById(R.id.lblnombre);
        Bundle parametros = getIntent().getExtras();
        vnombre.setText("Bienvenido " + parametros.getString("nombre"));

    }
    public  void back (View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
        finish();
    }

}
