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
	private Random random = new Random();
	int n;
	Button reset;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		InputAngka = findViewById(R.id.number_input);
		reset = (Button)findViewById(R.id.reset_button);
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		n = random.nextInt(100)+1;

	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String input = InputAngka.getText().toString();
		int number = Integer.parseInt(input);

		if(number == n)
		{
			Toast.makeText(this, "Angka Benar", Toast.LENGTH_SHORT).show();
		}
		else if(number > n)
		{
			Toast.makeText(this, "Angka Terlalu Besar", Toast.LENGTH_SHORT).show();
		}
		else if(number < n)
		{
			Toast.makeText(this, "Angka Terlalu Kecil", Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		InputAngka.setText("");
		initRandomNumber();
	}
}
