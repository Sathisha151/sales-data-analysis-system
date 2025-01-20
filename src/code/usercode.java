/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.sql.Date;

/**
 *
 * @author Sathisha
 */
public class usercode {
    private int TransactionID;
    private int CustomerID;
    private int ProductID;
    private String ProductName;
    private int Quantity;
    private Double PriceperUnit;
    private Date Date;
    private Double TotalPrice;
    private String Region;

    public usercode(int aInt, int aInt0, String string, int aInt1, double aDouble, Date date, double aDouble0, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Double getPriceperUnit() {
        return PriceperUnit;
    }

    public void setPriceperUnit(Double PriceperUnit) {
        this.PriceperUnit = PriceperUnit;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public usercode(int TransactionID, int CustomerID, int ProductID, String ProductName, int Quantity, Double PriceperUnit, Date Date, Double TotalPrice, String Region) {
        this.TransactionID = TransactionID;
        this.CustomerID = CustomerID;
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.Quantity = Quantity;
        this.PriceperUnit = PriceperUnit;
        this.Date = Date;
        this.TotalPrice = TotalPrice;
        this.Region = Region;
    }

   
    }

   


