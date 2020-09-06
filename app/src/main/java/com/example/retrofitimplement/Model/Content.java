package com.example.retrofitimplement.Model;

import com.squareup.moshi.Json;

public class Content {

    @Json(name = "Date")
    private String date;
    @Json(name = "BillNo")
    private String billNo;
    @Json(name = "usercode")
    private String usercode;
    @Json(name = "ItemName")
    private String itemName;
    @Json(name = "Rate")
    private String rate;
    @Json(name = "Qty")
    private String qty;
    @Json(name = "Total")
    private String total;
    @Json(name = "Auto")
    private String auto;
    @Json(name = "Rrate")
    private String rrate;
    @Json(name = "Amount")
    private String amount;
    @Json(name = "Tax")
    private String tax;
    @Json(name = "ItemId")
    private String itemId;
    @Json(name = "Net")
    private String net;
    @Json(name = "CGST")
    private String cGST;
    @Json(name = "SGST")
    private String sGST;
    @Json(name = "KFC")
    private String kFC;
    @Json(name = "Cess")
    private String cess;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getRrate() {
        return rrate;
    }

    public void setRrate(String rrate) {
        this.rrate = rrate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getCGST() {
        return cGST;
    }

    public void setCGST(String cGST) {
        this.cGST = cGST;
    }

    public String getSGST() {
        return sGST;
    }

    public void setSGST(String sGST) {
        this.sGST = sGST;
    }

    public String getKFC() {
        return kFC;
    }

    public void setKFC(String kFC) {
        this.kFC = kFC;
    }

    public String getCess() {
        return cess;
    }

    public void setCess(String cess) {
        this.cess = cess;
    }

}
