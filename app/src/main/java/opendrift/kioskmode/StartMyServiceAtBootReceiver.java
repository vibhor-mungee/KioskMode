package opendrift.kioskmode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by vibhormungee on 08/03/17.
 */

public class StartMyServiceAtBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Kiosk booted",Toast.LENGTH_SHORT);
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            Log.i("BootReceiver", "onReceive");
            Intent i = new Intent(context, FullscreenActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);

        }
    }
}
