
package com.example.albionbot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(v -> {
            Toast.makeText(this, "Бот запущен", Toast.LENGTH_SHORT).show();
            startService(new Intent(this, BotService.class));
        });

        Button btnPerm = findViewById(R.id.btn_perm);
        btnPerm.setOnClickListener(v -> {
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            startActivity(intent);
        });
    }
}
    