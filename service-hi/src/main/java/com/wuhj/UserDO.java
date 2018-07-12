package com.wuhj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by a123456 on 2018/7/10.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDO {

    private String id;

    private String name;

    private Integer age;

}
