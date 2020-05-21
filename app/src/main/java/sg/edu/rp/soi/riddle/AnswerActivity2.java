package sg.edu.rp.soi.riddle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends Activity {
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tv2=findViewById(R.id.tv2);
        // tv.setText("In second activity");
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        tv2.setText(questionSelected +" answer is: Gone");
    }
}
