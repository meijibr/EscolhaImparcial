package fnj.com.br.escolhaimparcial;

import android.content.res.Resources;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    boolean not_family = true;


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
        for(String s: criteriosString) {
            criterios.addCriterio(s);
            criterios.addCriterioNotFamily((s));
        }
        criteriosString = res.getStringArray(R.array.not_family);
        for(String s: criteriosString) {
            criterios.addCriterioNotFamily((s));
        }
        criterioButtonTextView = (TextView) findViewById(R.id.criterioButtonTextView);

        flipView = (EasyFlipView) findViewById(R.id.easyFlipView);
        rerollButtonImg = (ImageButton) findViewById(R.id.rerollButtonImg);

        rerollButtonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (not_family)
                    criterioButtonTextView.setText(criterios.getCriterioNotFamily());
                else
                    criterioButtonTextView.setText(criterios.getCriterio());
                flipView.flipTheView();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(item.isChecked())
            item.setChecked(false);
        else
            item.setChecked(true);

        switch (id) {
            case R.id.family:
                not_family = !not_family;
                //rerollButtonImg = (ImageButton) findViewById(R.id.rerollButtonImg);
                if (not_family) {
                    rerollButtonImg.setBackground(getResources().getDrawable(R.drawable.verso_vermelho, this.getTheme()));
                } else {
                    rerollButtonImg.setBackground(getResources().getDrawable(R.drawable.verso_azul, this.getTheme()));
                }


                break;
            default:
                break;
        }
        return true;

    }
}
