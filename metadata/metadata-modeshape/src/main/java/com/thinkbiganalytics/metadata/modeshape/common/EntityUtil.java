package com.thinkbiganalytics.metadata.modeshape.common;


import java.nio.file.Paths;

/**
 * Utility to get basic Paths for schema
 */
public class EntityUtil {

    public static String pathForCategory(){
        return Paths.get("/metadata", "feeds").toString();
    }


}








