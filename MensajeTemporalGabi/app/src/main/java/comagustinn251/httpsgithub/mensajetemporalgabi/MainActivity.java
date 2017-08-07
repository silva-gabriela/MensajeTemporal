package comagustinn251.httpsgithub.mensajetemporalgabi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    EditText Hola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hola = (EditText) findViewById(R.id.editText);
    }

    public void setName(View view) {
        Toast.makeText(this, Hola.getText().toString(),Toast.LENGTH_SHORT).show();
    }
}