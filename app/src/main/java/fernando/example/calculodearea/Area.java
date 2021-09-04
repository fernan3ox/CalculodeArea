package fernando.example.calculodearea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Area extends AppCompatActivity {

    private TextView ResultadoRec;
    private TextView ResultadoTri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        Log.wtf("Segunda Activity", "onCreate");

        ResultadoRec=(TextView)findViewById(R.id.text1);
        ResultadoTri=(TextView)findViewById(R.id.text2);

    }
    public void CalculoAreaRectangulo(View view){
        double base = getIntent().getDoubleExtra("numero1",0);
        double altura=getIntent().getDoubleExtra("numero2",0);
        ResultadoRec.setText("Area = "+(base*altura)+"cm^2");

    }
    public void CalculoAreaTriangulo(View view){
        double base = getIntent().getDoubleExtra("numero1",0);
        double altura=getIntent().getDoubleExtra("numero2",0);
        ResultadoTri.setText("Area = "+(base*altura/2)+"cm^2");

    }
}
