package fnj.com.br.escolhaimparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView criterioTextView;
    Button rerollButton;
    Criterios criterios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        criterios = new Criterios();


        criterioTextView = (TextView) findViewById(R.id.criterioTextView);
        rerollButton = (Button) findViewById(R.id.rerollButton);

        criterioTextView.setText(criterios.getCriterio());

        rerollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                criterioTextView.setText(criterios.getCriterio());
            }
        });
    }
}
