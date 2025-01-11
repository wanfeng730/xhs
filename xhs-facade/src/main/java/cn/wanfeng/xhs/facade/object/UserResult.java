package cn.wanfeng.xhs.facade.object;


import lombok.Data;

import java.io.Serializable;

/**
 * @date: 2025-01-11 23:16
 * @author: luozh.wanfeng
 * @description:
 * @since:
 */
@Data
public class UserResult implements Serializable {

    private String username;

    private String password;
}
