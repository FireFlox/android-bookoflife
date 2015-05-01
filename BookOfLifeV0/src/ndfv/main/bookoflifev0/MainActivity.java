package ndfv.main.bookoflifev0;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity implements OnClickListener{

	private Button compteurButton = null;
	private int numberOfCompteur = 0;
	private String compteurLabel = "Compteur";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        compteurButton = (Button) findViewById(R.id.button_compteurs);
        compteurButton.setOnClickListener(this);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

    	getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button_compteurs:
			onButtonCompteursClick();
			break;
		}
	}
	
	public void onButtonCompteursClick(){
		numberOfCompteur = numberOfCompteur + 1;
		compteurButton.setText(compteurLabel + "\n" + numberOfCompteur);
	}
}
