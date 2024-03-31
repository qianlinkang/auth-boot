package com.zigzag.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zigzag.model.system.SysRole;
import com.zigzag.modules.system.service.SysRoleService;
import com.zigzag.modules.system.mapper.SysRoleMapper;
import org.springframework.stereotype.Service;

/**
 * @author qlk
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
