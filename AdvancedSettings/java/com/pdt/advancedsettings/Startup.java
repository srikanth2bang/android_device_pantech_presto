package com.pdt.advancedsettings;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Startup extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent bootintent) {
        Pref1Fragment.restore(context);

    }
}
