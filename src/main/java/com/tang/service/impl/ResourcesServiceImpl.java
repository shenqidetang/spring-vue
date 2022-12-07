package com.tang.service.impl;

import com.tang.entity.Resources;
import com.tang.mapper.ResourcesMapper;
import com.tang.service.IResourcesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */
@Service
public class ResourcesServiceImpl extends ServiceImpl<ResourcesMapper, Resources> implements IResourcesService {

}
