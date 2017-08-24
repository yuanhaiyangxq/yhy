package com.nowcoder.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by yhy on 2017/7/25.
 */
public class ViewObject {
    private Map<String, Object> objs = new HashMap<String, Object>();
    public void set(String key, Object value) {
        objs.put(key, value);
    }

    public Object get(String key) {
        return objs.get(key);
    }
}
