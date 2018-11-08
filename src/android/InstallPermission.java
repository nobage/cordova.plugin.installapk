package cordova.plugins.install.permission;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class InstallPermission extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("checkInstallPermission")){
           callbackContext.success(this.checkInstallPermission() ? 1 : 0);
        }else if (action.equals("switchToAppInstallSettings")){
           this.switchToAppInstallSettings();
           callbackContext.success();
        }
        return false;
    }

    @TargetApi(Build.VERSION_CODES.O)
    public boolean checkInstallPermission(){
        return (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) ||this.cordova.getActivity().getPackageManager().canRequestPackageInstalls();
    }

    @TargetApi(Build.VERSION_CODES.O)
    public void switchToAppInstallSettings() {
        //8.0新API
        Intent intent = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES);
        this.cordova.getActivity().startActivity(intent);
    }
}
