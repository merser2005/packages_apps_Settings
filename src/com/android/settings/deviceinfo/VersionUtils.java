
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getCesiumOSVersion(){
        return SystemProperties.get("org.cesium.version","");
    }
}
