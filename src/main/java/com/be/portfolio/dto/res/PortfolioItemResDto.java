package com.be.portfolio.dto.res;

import com.be.portfolio.domain.PortfolioItemVO;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PortfolioItemResDto {
    private int portfolioItemId;
    private int portfolioId;
    private Integer productId;
    private String stockCode;
    private int amount;
    private double expectedReturn;
    private int riskLevel;

    public static PortfolioItemResDto of(PortfolioItemVO vo) {
        return vo == null ? null : PortfolioItemResDto.builder()
                .portfolioItemId(vo.getPortfolioItemId())
                .portfolioId(vo.getPortfolioId())
                .productId(vo.getProductId())
                .stockCode(vo.getStockCode())
                .amount(vo.getAmount())
                .expectedReturn(vo.getExpectedReturn())
                .riskLevel(vo.getRiskLevel())
                .build();
    }

    public PortfolioItemVO toVo() {
        return PortfolioItemVO.builder()
                .portfolioItemId(portfolioItemId)
                .portfolioId(portfolioId)
                .productId(productId)
                .stockCode(stockCode)
                .amount(amount)
                .expectedReturn(expectedReturn)
                .riskLevel(riskLevel)
                .build();
    }
}
