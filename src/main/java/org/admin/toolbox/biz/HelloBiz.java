package org.admin.toolbox.biz;

import org.admin.toolbox.mapper.HelloMapper;
import org.admin.toolbox.model.HelloInfo;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class HelloBiz {

    @Resource
    private HelloMapper helloMapper;

    public Object hello(String msg) {
        return HelloInfo.builder()
                .coreNum(Runtime.getRuntime().availableProcessors())
                .date(new Date())
                .name(msg + ":" + RandomStringUtils.randomNumeric(6))
                .build();
    }
}
