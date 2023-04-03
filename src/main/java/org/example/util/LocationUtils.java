package org.example.util;

import org.bukkit.Location;

public class LocationUtils {

    public static String getLocationString(Location location) {
        return "x=" + (int)location.getX()
                + " y=" + (int)location.getY()
                + " z=" + (int)location.getZ();
    }
}
