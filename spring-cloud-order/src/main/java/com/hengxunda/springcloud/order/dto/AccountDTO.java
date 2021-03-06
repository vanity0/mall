package com.hengxunda.springcloud.order.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDTO implements Serializable {

    private static final long serialVersionUID = 1282327367426303082L;

    @ApiModelProperty(name = "userId", value = "用户id", example = "10000", required = true)
    private String userId;

    @ApiModelProperty(name = "amount", value = "扣款金额", example = "100", required = true)
    private BigDecimal amount;
}
