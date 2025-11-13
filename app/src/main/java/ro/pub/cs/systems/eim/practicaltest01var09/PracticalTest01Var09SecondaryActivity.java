package ro.pub.cs.systems.eim.practicaltest01var09;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

class PracticalTest01Var09SecondaryActivity extends AppCompatActivity {
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_practical_test01_var09_main);

        Intent intent = getIntent();
    }
}
