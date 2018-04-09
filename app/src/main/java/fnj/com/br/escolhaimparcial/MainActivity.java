package fnj.com.br.escolhaimparcial;

import android.content.res.Resources;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    TextView criterioTextView;
    Button rerollButton;
    ImageButton rerollButtonImg;
    Criterios criterios;

    private static final String TAG = "MainActivity";

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        criterios = new Criterios();

        Resources res = getResources();
        String[] criteriosString = res.getStringArray(R.array.criteria);
/*        for(int i = 0; i < 93; i++) {
            criterios.addCriterio(criteriosString[i]);
        }*/
        for(String s: criteriosString) {
            criterios.addCriterio(s);
        }


        criterioTextView = (TextView) findViewById(R.id.criterioTextView);
        rerollButton = (Button) findViewById(R.id.rerollButton);

        rerollButton.setText("Roll");
        //criterioTextView.setText(criterios.getCriterio());

        rerollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                criterioTextView.setText(criterios.getCriterio());
                rerollButton.setText("Reroll");
            }
        });

        rerollButtonImg = (ImageButton) findViewById(R.id.rerollButtonImg);

        rerollButtonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                criterioTextView.setText(criterios.getCriterio());
                rerollButton.setText("Reroll");
            }
        });
    }
}
