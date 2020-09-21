package com.example.jaypatel_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class VRActivity extends AppCompatActivity
{
    TextView messageTextView;
    String message = "VRActivity: \nonCreate executed \nonStart executed";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);

        messageTextView = findViewById(R.id.message_tv);

        setMessage(R.string.on_create);

    }

    @Override
    protected void onStart() {
        super.onStart();
        setMessage(R.string.on_start);
    }

    @Override
    protected void onStop() {
        super.onStop();
        setMessage(R.string.on_stop);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setMessage(R.string.on_destroy);
    }

    private void setMessage(int messageId) {
        if (messageTextView != null) {

            if (message.isEmpty()) {
                message += this.getResources().getString(R.string.vr_activity);
            }

            message = message + "\n" + this.getResources().getString(messageId);
            messageTextView.setText(message);
        }
    }

}