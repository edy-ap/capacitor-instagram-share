package com.apestudios.instagram.share;

import android.util.Log;

public class InstagramShare {

    private InstagramSharePlugin plugin;

    public InstagramShare(InstagramSharePlugin plugin) {
        this.plugin = plugin;
    }

    public void shareVideo(PluginCall call, String filePath) {
        File parentDir = plugin.getContext().getExternalFilesDir(null);
        File file = new File(filePath.substring(7));
        File tmpFile = null;
        try {
            tmpFile = File.createTempFile("instagram", ".mp4", parentDir);
            copyFile(tmpFile, new FileInputStream(file));
        } catch (IOException e) {
            call.reject(e.getLocalizedMessage());
        }

        Uri data = FileProvider.getUriForFile(plugin.getContext(), plugin.getAppId() + ".fileprovider", tmpFile);

        // Instantiate an intent
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");

        // Attach your App ID to the intent
        // String sourceApplication = "1286159535492434"; // This is your application's FB ID
        String sourceApplication = plugin.getConfig().getString("facebookAppId");
        if (sourceApplication == null) {
            call.reject("facebookAppId not present");
        }
        intent.putExtra("source_application", sourceApplication);

        intent.setDataAndType(data, "video/*");

        // Grant URI permissions for the image
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        plugin.startActivityForResult(call, intent, "processShare");
    }

    private void copyFile(File outFile, InputStream is) throws IOException {
        FileOutputStream fos = new FileOutputStream(outFile);
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fos.close();
    }
}
