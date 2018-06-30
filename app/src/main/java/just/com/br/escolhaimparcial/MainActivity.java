package just.com.br.escolhaimparcial;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.wajahatkarim3.easyflipview.EasyFlipView;


public class    MainActivity extends AppCompatActivity {

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
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-8482517945581520~7670763856");
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

        criteriosString = res.getStringArray(R.array.dia_aniversario);
        for(String s: criteriosString) {
            criterios.addCriterioDiaAniversaio((s));
        }
        criteriosString = res.getStringArray(R.array.mes_aniversario);
        for(String s: criteriosString) {
            criterios.addCriterioMesAniversaio((s));
        }
        criteriosString = res.getStringArray(R.array.telefone);
        for(String s: criteriosString) {
            criterios.addCriterioTelefone((s));
        }
        criteriosString = res.getStringArray(R.array.signo);
        for(String s: criteriosString) {
            criterios.addCriterioSigno((s));
        }

        criterioButtonTextView = (TextView) findViewById(R.id.criterioButtonTextView);

        flipView = (EasyFlipView) findViewById(R.id.easyFlipView);
        rerollButtonImg = (ImageButton) findViewById(R.id.rerollButtonImg);

        if (not_family)
            Toast.makeText(getApplicationContext(), getResources().getText(R.string.dica_inicial),Toast.LENGTH_LONG).show();



        rerollButtonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (not_family) {
                    String tmp = criterios.getCriterioNotFamily();
                    switch (tmp) {
                        case "1":
                            criterioButtonTextView.setText(criterios.getCriterioDiaAniversario());
                            break;
                        case "2":
                            criterioButtonTextView.setText(criterios.getCriterioMesAniversario());
                            break;
                        case "3":
                            criterioButtonTextView.setText(criterios.getCriterioTelefone());
                            break;
                        case "4":
                            criterioButtonTextView.setText(criterios.getCriterioSigno());
                            break;
                        default:
                            criterioButtonTextView.setText(tmp);
                    }
                }
                else {
                    String tmp = criterios.getCriterio();
                    switch (tmp) {
                        case "1":
                            criterioButtonTextView.setText(criterios.getCriterioDiaAniversario());
                            break;
                        case "2":
                            criterioButtonTextView.setText(criterios.getCriterioMesAniversario());
                            break;
                        case "3":
                            criterioButtonTextView.setText(criterios.getCriterioTelefone());
                            break;
                        case "4":
                            criterioButtonTextView.setText(criterios.getCriterioSigno());
                            break;
                        default:
                            criterioButtonTextView.setText(tmp);
                    }
                }
                flipView.flipTheView();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        String pathName;

        if(item.isChecked()) {
            item.setChecked(false);
            rerollButtonImg.setImageResource(R.drawable.verso_vermelho);
            pathName = "/drawable/frente_vermelho.png";
            criterioButtonTextView.setBackgroundResource(R.drawable.frente_vermelho);
        }
        else {
            rerollButtonImg.setImageResource(R.drawable.verso_azul);
            pathName = "/drawable/frente_azul.png";
            criterioButtonTextView.setBackgroundResource(R.drawable.frente_azul);
            // rerollButtonImg.setBackground(getResources().getDrawable(R.drawable.verso_azul, this.getTheme()));
            item.setChecked(true);
        }

        switch (id) {
            case R.id.family:
                not_family = !not_family;
                //rerollButtonImg = (ImageButton) findViewById(R.id.rerollButtonImg);
                break;
            case R.id.help:
                Toast.makeText(getApplicationContext(), getResources().getText(R.string.help),Toast.LENGTH_LONG).show();
                break;
            case R.id.creditos:
                final AlertDialog d = new AlertDialog.Builder(this)
                        .setPositiveButton(android.R.string.ok, null)
                        .setMessage( getResources().getText(R.string.creditos) )
                        .create();

                d.show();

                ((TextView)d.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
                break;
            default:
                break;
        }
        return true;

    }
}
