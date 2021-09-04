package fernando.example.calculodearea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText Base;
    private EditText Altura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.wtf("Main Activity", "onCreate");



        Base=(EditText)findViewById(R.id.edit1);
        Altura=(EditText)findViewById(R.id.edit2);

    }

    public void Siguiente(View view){

        Intent intent=new Intent(this,Area.class);
        intent.putExtra("numero1",Double.parseDouble(Base.getText().toString()));
        intent.putExtra("numero2",Double.parseDouble(Altura.getText().toString()));
    startActivity(intent);
    }
}
