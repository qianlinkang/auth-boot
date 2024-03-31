package com.zigzag.system.mapper;

import com.zigzag.model.system.SysRole;
import com.zigzag.modules.system.mapper.SysRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author qlk
 */
@SpringBootTest
class SysRoleMapperTest {

    @Autowired
    private SysRoleMapper mapper;

    @Test
    void testSelectList() {
        List<SysRole> sysRoles = mapper.selectList(null);
        sysRoles.forEach(System.out::println);
    }

}