package franciscojavierjimenezjaimes.edu.tesoem.itics.p4fjjj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText vnombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vnombre = (EditText) findViewById(R.id.txtnombre);
    }
    public void Invocar (View view){
        Intent enviar = new Intent(this, RecibeParametrosActivity.class);
        enviar.putExtra("nombre", vnombre.getText().toString());
        startActivity(enviar);
        this.finish();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.menuacercade) {
            Toast.makeText(this, "Acerca De.", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, AcercaActivity.class));
            finish();
        }
        return super.onOptionsItemSelected(item);


    }
}
