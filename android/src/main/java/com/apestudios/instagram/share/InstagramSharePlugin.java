package com.apestudios.instagram.share;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "InstagramShare")
public class InstagramSharePlugin extends Plugin {

    private InstagramShare implementation;

    @Override
    public void load() {
        implementation = new InstagramShare(this);
    }

    @PluginMethod
    public void shareVideo(PluginCall call) {
        String path = call.getString("path");

        implementation.shareVideo(call, path);
    }

    @ActivityCallback
    public void processShare(PluginCall call, ActivityResult result) {
        Log.d(getLogTag(), "result Share: " + result.getResultCode());
        Log.d(getLogTag(), "result Share: " + result.getData());

        JSObject response = new JSObject();
        response.put("success", true);
        response.put("message", "Shared successfully");

        call.resolve(response);
    }
}
