package com.example.assignment.db.northwindassignment.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="Orders")
public class Orders {
    @Id
    @Column(name="orderid")
    private Integer Order_ID;
    @Column(name="customerid")
    private String Customer_Id;
    @Column(name="employeeid")
    private Integer  Employee_ID;
    @Column(name="orderdate")
    private String Order_Date;
    @Column(name="requireddate")

    private String Required_Date;
    @Column(name="shippeddate")

    private String Shipped_Date;
    @Column(name="shipvia")
    private Integer  Ship_via;

    private Float Freight ;
    @Column(name="shipname")


    private String Ship_Name;
    @Column(name="shipaddress")

    private String Ship_Address;
    @Column(name="shipcity")

    private String Ship_City;
    @Column(name="shipregion")

    private String Ship_Region;
    @Column(name="shippostalcode")

    private String Ship_Postal_Code;
    @Column(name="shipcountry")

    private String Ship_Country;

    public Integer getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(Integer order_ID) {
        Order_ID = order_ID;
    }

    public String getCustomer_Id() {
        return Customer_Id;
    }

    public void setCustomer_Id(String customer_Id) {
        Customer_Id = customer_Id;
    }

    public Integer getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(Integer employee_ID) {
        Employee_ID = employee_ID;
    }

    public String getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(String order_Date) {
        Order_Date = order_Date;
    }

    public String getRequired_Date() {
        return Required_Date;
    }

    public void setRequired_Date(String required_Date) {
        Required_Date = required_Date;
    }

    public String getShipped_Date() {
        return Shipped_Date;
    }

    public void setShipped_Date(String shipped_Date) {
        Shipped_Date = shipped_Date;
    }

    public Integer getShip_via() {
        return Ship_via;
    }

    public void setShip_via(Integer ship_via) {
        Ship_via = ship_via;
    }

    public Float getFreight() {
        return Freight;
    }

    public void setFreight(Float freight) {
        Freight = freight;
    }

    public String getShip_Name() {
        return Ship_Name;
    }

    public void setShip_Name(String ship_Name) {
        Ship_Name = ship_Name;
    }

    public String getShip_Address() {
        return Ship_Address;
    }

    public void setShip_Address(String ship_Address) {
        Ship_Address = ship_Address;
    }

    public String getShip_City() {
        return Ship_City;
    }

    public void setShip_City(String ship_City) {
        Ship_City = ship_City;
    }

    public String getShip_Region() {
        return Ship_Region;
    }

    public void setShip_Region(String ship_Region) {
        Ship_Region = ship_Region;
    }

    public String getShip_Postal_Code() {
        return Ship_Postal_Code;
    }

    public void setShip_Postal_Code(String ship_Postal_Code) {
        Ship_Postal_Code = ship_Postal_Code;
    }

    public String getShip_Country() {
        return Ship_Country;
    }

    public void setShip_Country(String ship_Country) {
        Ship_Country = ship_Country;
    }
}






