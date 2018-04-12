package fnj.com.br.escolhaimparcial;

import android.content.res.Resources;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.wajahatkarim3.easyflipview.EasyFlipView;


public class MainActivity extends AppCompatActivity {

    TextView criterioButtonTextView;
    ImageButton rerollButtonImg;
    Criterios criterios;


    private EasyFlipView flipView;

    private static final String TAG = "MainActivity";

    private AdView mAdView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);//Menu Resource, Menu
        return true;
    }

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

        criterioButtonTextView = (TextView) findViewById(R.id.criterioButtonTextView);

        flipView = (EasyFlipView) findViewById(R.id.easyFlipView);
        rerollButtonImg = (ImageButton) findViewById(R.id.rerollButtonImg);

        rerollButtonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                criterioButtonTextView.setText(criterios.getCriterio());
                flipView.flipTheView();
            }
        });
    }
}
