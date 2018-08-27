package ru.production.ssobolevsky.recyclertest;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v4.content.LocalBroadcastManager;

import java.util.ArrayList;
import java.util.List;

public class MyService extends Service {

    public static final String DATA = "DATA";
    private static final int MODE = START_NOT_STICKY;

    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<BaseItem> list = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    int randomNumber = (int) (Math.random() * 3);
                    if (randomNumber == 0) {
                        ItemA item = new ItemA();
                        item.setText("Вьюха первого типа");
                        list.add(item);
                    }
                    //else if (randomNumber == 1) {
                    //    ItemB item = new ItemB();
                    //    item.setText("Запущена");
                    //    item.setTextTwo("Вьюха второго типа");
                    //    list.add(item);
                    //} else if (randomNumber == 2) {
                    //    ItemC item = new ItemC();
                    //    item.setText("Все еще третья вьюха");
                    //    item.setTextTwo("Запущена");
                    //    item.setTextThree("Вьюха третьего типа");
                    //}
                }
                Intent intent = new Intent("SOBOLEVSKY");
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList(DATA, (ArrayList<? extends Parcelable>) list);
                sendBroadcast(intent);
            }
        }).start();
        return MODE;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static final Intent onNewIntent(Context context) {
        Intent intent = new Intent(context, MyService.class);
        return intent;
    }
}
