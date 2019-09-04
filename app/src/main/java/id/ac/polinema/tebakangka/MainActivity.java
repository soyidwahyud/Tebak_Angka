package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText InputAngka;
	private TextView ViewAngka;
	private PopupMenu popAngka;
	private EditText GuessButton;
	Random random = new Random();
	int n;
	Button guessbutton;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		InputAngka = findViewById(R.id.number_input);
		guessbutton = (Button)findViewById(R.id.guess_button);
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		n = ;
		return;

	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String input = InputAngka.getText().toString();
		int number = Integer.parseInt(input);

		if(number > n)
		{
			Toast.makeText(this, "Angka Terlalu besar", Toast.LENGTH_SHORT).show();
		}
		else if(number < n)
		{
			Toast.makeText(this, "Angka Terlalu kecil", Toast.LENGTH_SHORT).show();
		}
		else
		{
			guessbutton.setEnabled(false);
			Toast.makeText(this, "Tebakan anda benar", Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		InputAngka.setText("");
		guessbutton.setEnabled(true);
		initRandomNumber();
	}
}
