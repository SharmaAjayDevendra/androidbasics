package in.autodice.androidlecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    EditText username;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.username);
        output=findViewById(R.id.output);
    }

    public void showMessage(View view) {
        String name=username.getText().toString();
        output.setText(name);
    }
}
