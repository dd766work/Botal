
package com.example.albionbot;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.util.Log;

public class BotService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // Здесь будет логика бота
        Log.d("AlbionBot", "Event: " + event.toString());
    }

    @Override
    public void onInterrupt() {
    }
}
    