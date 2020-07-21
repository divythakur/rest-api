package com.example.assignment.db.northwindassignment.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Orders {
    @Id
    private Integer Order_ID;
    private String Customer_Id;
    private Integer  Employee_ID;
    private String Order_Date;
    private String Required_Date;
    private String Shipped_Date;
    @Column(name="ShipVia")
    private Integer  Ship_via;
    private Float Freight ;
    private Integer Ship_Name;
    private Integer Ship_Address;
    private Integer Ship_City;
    private Integer Ship_Region;
    private Integer Ship_Postal_Code;
    private Integer Ship_Country;
    @ManyToOne
    @JoinColumn(name = "Customer_Id", insertable = false, updatable = false)
    private customer Customer;

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

    public Integer getShip_Name() {
        return Ship_Name;
    }

    public void setShip_Name(Integer ship_Name) {
        Ship_Name = ship_Name;
    }

    public Integer getShip_Address() {
        return Ship_Address;
    }

    public void setShip_Address(Integer ship_Address) {
        Ship_Address = ship_Address;
    }

    public Integer getShip_City() {
        return Ship_City;
    }

    public void setShip_City(Integer ship_City) {
        Ship_City = ship_City;
    }

    public Integer getShip_Region() {
        return Ship_Region;
    }

    public void setShip_Region(Integer ship_Region) {
        Ship_Region = ship_Region;
    }

    public Integer getShip_Postal_Code() {
        return Ship_Postal_Code;
    }

    public void setShip_Postal_Code(Integer ship_Postal_Code) {
        Ship_Postal_Code = ship_Postal_Code;
    }

    public Integer getShip_Country() {
        return Ship_Country;
    }

    public void setShip_Country(Integer ship_Country) {
        Ship_Country = ship_Country;
    }

    public customer getCustomer() {
        return Customer;
    }

    public void setCustomer(customer customer) {
        Customer = customer;
    }
}




