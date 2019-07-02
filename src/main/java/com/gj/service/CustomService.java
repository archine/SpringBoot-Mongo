package com.gj.service;

import com.gj.domain.Custom;
import com.gj.repository.CustomRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Gjing
 **/
@Service
public class CustomService {

    @Resource
    private CustomRepository customRepository;


    /**
     * 添加用户
     * @param custom 用户对象
     * @return 成功返回true
     */
    public boolean insertCustom(Custom custom) {
        Custom save = customRepository.save(custom);
        return save != null;
    }

    /**
     * 删除用户
     * @param id 用户id
     */
    public void deleteCustom(Integer id) {
        customRepository.deleteById(id);
    }


    /**
     * 查询用户列表
     * @return 列表
     */
    public List<Custom> customList() {
        return customRepository.findAll();
    }

    /**
     * 更新用户
     * @param customId 用户id
     * @param customName 用户名
     * @return boolean
     */
    public boolean updateCustom(Integer customId, String customName) {
        Custom custom = customRepository.findById(customId).orElseThrow(() -> new NullPointerException("用户不存在"));
        custom.setCustomName(customName);
        customRepository.save(custom);
        return true;
    }
}
