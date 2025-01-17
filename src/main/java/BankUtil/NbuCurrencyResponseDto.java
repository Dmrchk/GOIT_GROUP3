package BankUtil;

import currencyBot.Currency;

import java.math.BigDecimal;


public class NbuCurrencyResponseDto {
    private String r030;
    private String txt;
    private BigDecimal rate;
    private Currency cc;
    private String exchangedate;

    public String getR030() {
        return r030;
    }

    public void setR030(String r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Currency getCc() {
        return cc;
    }

    public void setCc(Currency cc) {
        this.cc = cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public String toString() {
        return "NbuCurrencyResponseDto{" +
                "r030='" + r030 + '\'' +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc=" + cc +
                ", exchangedate='" + exchangedate + '\'' +
                '}';
    }
}