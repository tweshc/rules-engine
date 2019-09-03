package com.inrhythm.rulesengine.model;

import io.swagger.annotations.ApiModel;
import lombok.*;
import org.springframework.data.annotation.Id;

/**
 * JSON representation:
 * {
 *     "id" : 9999,
 *     "calculateBankBalance" : false,
 *     "calculateAssets" : true,
 *     "calculateTotalInvestments" : false,
 *     "calculateTotalLiabilities" : true
 * }
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@ApiModel
public class Rule {
    @Id
    public Long id;
    public Boolean calculateBankBalance;
    public Boolean calculateAssets;
    public Boolean calculateTotalInvestments;
    public Boolean calculateTotalLiabilities;
}