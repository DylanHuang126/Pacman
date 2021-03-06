package edu.rice.comp504.util;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class GsonExcludeStrategy implements ExclusionStrategy {
    @Override
    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return fieldAttributes.getAnnotation(HiddenInGson.class) != null;
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
        return false;
    }
}
