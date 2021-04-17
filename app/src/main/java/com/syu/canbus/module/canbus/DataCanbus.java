package com.syu.canbus.module.canbus;

import com.syu.ipc.RemoteModuleProxy;
import com.syu.canbus.module.UiNotifyEvent;

public class DataCanbus {
    public static final int[] DATA = new int[FinalCanbus.U_CNT_MAX];
    public static final boolean DEBUG_AIR = true;
    public static final boolean DEBUG_DOOR = true;
    public static final UiNotifyEvent[] NOTIFY_EVENTS = new UiNotifyEvent[FinalCanbus.U_CNT_MAX];
    public static final RemoteModuleProxy PROXY = new RemoteModuleProxy();
    public static int carId;
    public static int sCanbusId;

    static {
        for (int i = 0; i < 1200; i++) {
            NOTIFY_EVENTS[i] = new UiNotifyEvent(i);
        }
        DATA[1001] = 1;
        DATA[1002] = 1;
        //DoorHelper.doorWindowEnable(1);
        //AirHelper.airWindowEnable(1);
    }
}