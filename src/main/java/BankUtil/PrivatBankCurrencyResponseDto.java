package BankUtil;

import currencyBot.Currency;

import java.math.BigDecimal;
import java.util.Objects;

public class PrivatBankCurrencyResponseDto {
    private Currency ccy;
    private Currency base_ccy;
    private BigDecimal buy;
    private BigDecimal sale;

    public Currency getCcy() {
        return ccy;
    }

    public void setCcy(Currency ccy) {
        this.ccy = ccy;
    }

    public Currency getBase_ccy() {
        return base_ccy;
    }

    public void setBase_ccy(Currency base_ccy) {
        this.base_ccy = base_ccy;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public void setBuy(BigDecimal buy) {
        this.buy = buy;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrivatBankCurrencyResponseDto)) return false;
        PrivatBankCurrencyResponseDto aPrivat = (PrivatBankCurrencyResponseDto) o;
        return Objects.equals(ccy, aPrivat.ccy) && Objects.equals(base_ccy, aPrivat.base_ccy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ccy, base_ccy);
    }

    @Override
    public String toString() {
        return "PrivatBankCurrencyResponseDto{" +
                "ccy=" + ccy +'\'' +
                ", base_ccy=" + base_ccy +'\'' +
                ", buy=" + buy +
                ", sale=" + sale +
                '}';
    }
}