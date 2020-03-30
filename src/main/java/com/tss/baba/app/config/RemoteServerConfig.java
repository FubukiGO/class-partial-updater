package com.tss.baba.app.config;

import com.tss.baba.app.model.RemoteServer;

import java.util.List;

/**
 * @author: akhan
 * @description:
 * @date: 1:24 2020/3/29
 */
public class RemoteServerConfig {

    private static volatile RemoteServerConfig INSTANCE;

    private List<RemoteServer> serverList = null;

    public static RemoteServerConfig getInstance(){
        if(INSTANCE == null) {
            synchronized (RemoteServerConfig.class) {
                if(INSTANCE == null) {
                    INSTANCE = new RemoteServerConfig();
                }
            }
        }

        return INSTANCE;
    }

    private RemoteServerConfig(){

    }

    private void load() {

    }
}
