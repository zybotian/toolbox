package org.admin.toolbox.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class HelloInfo {
    private Date date;
    private int coreNum;
    private String name;
}
