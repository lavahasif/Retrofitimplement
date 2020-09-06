package com.example.retrofitimplement.Model;

import java.util.List;
import com.squareup.moshi.Json;

public class KotGmodel2 {

    @Json(name = "BillNo")
    private Integer billNo;
    @Json(name = "Date")
    private String date;
    @Json(name = "Time")
    private String time;
    @Json(name = "Waiter")
    private String waiter;
    @Json(name = "KOTNo")
    private Integer kOTNo;
    @Json(name = "Customer")
    private String customer;
    @Json(name = "TotalAmount")
    private Double totalAmount;
    @Json(name = "Discount")
    private Double discount;
    @Json(name = "OtherCharges")
    private Double otherCharges;
    @Json(name = "NetAmount")
    private Double netAmount;
    @Json(name = "CreditAccount")
    private String creditAccount;
    @Json(name = "Type")
    private String type;
    @Json(name = "printstatus")
    private String printstatus;
    @Json(name = "pgmType")
    private Integer pgmType;
    @Json(name = "narration")
    private String narration;
    @Json(name = "OBillNo")
    private Integer oBillNo;
    @Json(name = "VBillNo")
    private Integer vBillNo;
    @Json(name = "Duration")
    private Double duration;
    @Json(name = "table")
    private String table;
    @Json(name = "cashrecieved")
    private Integer cashrecieved;
    @Json(name = "balance")
    private Integer balance;
    @Json(name = "cgst")
    private Integer cgst;
    @Json(name = "sgst")
    private Integer sgst;
    @Json(name = "settilmentstatus")
    private Integer settilmentstatus;
    @Json(name = "autoprint")
    private Integer autoprint;
    @Json(name = "aps")
    private Integer aps;
    @Json(name = "cardtype")
    private String cardtype;
    @Json(name = "cardamount")
    private Double cardamount;
    @Json(name = "dinetype")
    private String dinetype;
    @Json(name = "serviceTAX")
    private Integer serviceTAX;
    @Json(name = "floor")
    private Integer floor;
    @Json(name = "kotstatus")
    private Integer kotstatus;
    @Json(name = "BankName")
    private String bankName;
    @Json(name = "CardNumber")
    private String cardNumber;
    @Json(name = "Net")
    private Integer net;
    @Json(name = "KFC")
    private Integer kFC;
    @Json(name = "Cess")
    private Integer cess;
    @Json(name = "TockenNo")
    private Integer tockenNo;
    @Json(name = "PartyName")
    private String partyName;
    @Json(name = "Padd1")
    private String padd1;
    @Json(name = "Padd2")
    private String padd2;
    @Json(name = "Padd3")
    private String padd3;
    @Json(name = "PMobile")
    private String pMobile;
    @Json(name = "gst")
    private String gst;
    @Json(name = "name")
    private String name;
    @Json(name = "mobno")
    private String mobno;
    @Json(name = "address")
    private String address;
    @Json(name = "roundoff")
    private String roundoff;
    @Json(name = "note")
    private String note;
    @Json(name = "parcelno")
    private Integer parcelno;
    @Json(name = "pservice")
    private String pservice;
    @Json(name = "content")
    private List<Content> content = null;

    public Integer getBillNo() {
        return billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public Integer getKOTNo() {
        return kOTNo;
    }

    public void setKOTNo(Integer kOTNo) {
        this.kOTNo = kOTNo;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(Double otherCharges) {
        this.otherCharges = otherCharges;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public String getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrintstatus() {
        return printstatus;
    }

    public void setPrintstatus(String printstatus) {
        this.printstatus = printstatus;
    }

    public Integer getPgmType() {
        return pgmType;
    }

    public void setPgmType(Integer pgmType) {
        this.pgmType = pgmType;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public Integer getOBillNo() {
        return oBillNo;
    }

    public void setOBillNo(Integer oBillNo) {
        this.oBillNo = oBillNo;
    }

    public Integer getVBillNo() {
        return vBillNo;
    }

    public void setVBillNo(Integer vBillNo) {
        this.vBillNo = vBillNo;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Integer getCashrecieved() {
        return cashrecieved;
    }

    public void setCashrecieved(Integer cashrecieved) {
        this.cashrecieved = cashrecieved;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getCgst() {
        return cgst;
    }

    public void setCgst(Integer cgst) {
        this.cgst = cgst;
    }

    public Integer getSgst() {
        return sgst;
    }

    public void setSgst(Integer sgst) {
        this.sgst = sgst;
    }

    public Integer getSettilmentstatus() {
        return settilmentstatus;
    }

    public void setSettilmentstatus(Integer settilmentstatus) {
        this.settilmentstatus = settilmentstatus;
    }

    public Integer getAutoprint() {
        return autoprint;
    }

    public void setAutoprint(Integer autoprint) {
        this.autoprint = autoprint;
    }

    public Integer getAps() {
        return aps;
    }

    public void setAps(Integer aps) {
        this.aps = aps;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public Double getCardamount() {
        return cardamount;
    }

    public void setCardamount(Double cardamount) {
        this.cardamount = cardamount;
    }

    public String getDinetype() {
        return dinetype;
    }

    public void setDinetype(String dinetype) {
        this.dinetype = dinetype;
    }

    public Integer getServiceTAX() {
        return serviceTAX;
    }

    public void setServiceTAX(Integer serviceTAX) {
        this.serviceTAX = serviceTAX;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getKotstatus() {
        return kotstatus;
    }

    public void setKotstatus(Integer kotstatus) {
        this.kotstatus = kotstatus;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getNet() {
        return net;
    }

    public void setNet(Integer net) {
        this.net = net;
    }

    public Integer getKFC() {
        return kFC;
    }

    public void setKFC(Integer kFC) {
        this.kFC = kFC;
    }

    public Integer getCess() {
        return cess;
    }

    public void setCess(Integer cess) {
        this.cess = cess;
    }

    public Integer getTockenNo() {
        return tockenNo;
    }

    public void setTockenNo(Integer tockenNo) {
        this.tockenNo = tockenNo;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPadd1() {
        return padd1;
    }

    public void setPadd1(String padd1) {
        this.padd1 = padd1;
    }

    public String getPadd2() {
        return padd2;
    }

    public void setPadd2(String padd2) {
        this.padd2 = padd2;
    }

    public String getPadd3() {
        return padd3;
    }

    public void setPadd3(String padd3) {
        this.padd3 = padd3;
    }

    public String getPMobile() {
        return pMobile;
    }

    public void setPMobile(String pMobile) {
        this.pMobile = pMobile;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoundoff() {
        return roundoff;
    }

    public void setRoundoff(String roundoff) {
        this.roundoff = roundoff;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getParcelno() {
        return parcelno;
    }

    public void setParcelno(Integer parcelno) {
        this.parcelno = parcelno;
    }

    public String getPservice() {
        return pservice;
    }

    public void setPservice(String pservice) {
        this.pservice = pservice;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

}
