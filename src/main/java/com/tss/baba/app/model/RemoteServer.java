package com.tss.baba.app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author: akhan
 * @description:
 * @date: 0:26 2020/3/29
 */

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class RemoteServer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地址
     */
    private String host;

    /**
     * 密码
     */
    private String password;

    private String name;

    private Integer port;

    private List<String> path;

    public RemoteServer(String host, String password, String name, Integer port, List<String> path) {
        this.host = host;
        this.password = password;
        this.name = name;
        this.port = port;
        this.path = path;
    }
}
