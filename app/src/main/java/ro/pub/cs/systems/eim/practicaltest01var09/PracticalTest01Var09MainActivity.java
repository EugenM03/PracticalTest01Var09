package ro.pub.cs.systems.eim.practicaltest01var09;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PracticalTest01Var09MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practical_test01_var09_main);

        Button addButton = findViewById(R.id.add_button);
        Button computeButton = findViewById(R.id.compute_button);
        EditText nextTermText = findViewById(R.id.next_term);
        EditText allTermsText = findViewById(R.id.all_terms);

        // add button (number only)
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currNumber = nextTermText.getText().toString();
                if (!currNumber.isEmpty()) {
                    if (!allTermsText.getText().toString().isBlank()) {
                        allTermsText.getText().append(" + ");
                    }
                    allTermsText.getText().append(currNumber);
                }
            }
            });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}