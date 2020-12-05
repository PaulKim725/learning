package com.paul.springboot71.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 角色
 *
 * @author jinzhm
 * @date 2020/12/5 13:49
 */
@Data
@NoArgsConstructor
public class Role {

    @Id
    @Column
    private Long id;

    @Column
    private String name;


}
