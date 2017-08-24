package com.nowcoder.async;

import java.util.List;

/**
 * Created by nowcoder on 2017/8/16.
 */
public interface EventHandler {
    void doHandle(EventModel model);
    List<EventType> getSupportEventTypes();
}
