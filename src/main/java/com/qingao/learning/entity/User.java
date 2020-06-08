package com.qingao.learning.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author qingao
 * @email gao.qin@linkedcare.cn
 * @date 2019/5/31 13:31
 **/
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer age;
    @Column
    private String email;

}
