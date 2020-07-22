package com.example.assignment.db.northwindassignment.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    @Column(name="productid")
    private Integer Product_ID;
    @Column(name="productname")

    private String Product_Name;
    @Column(name="supplierid")

    private Integer Supplier_id;
    @Column(name="categoryid")

    private Integer Category_id;
    @Column(name="quantityperunit")

    private String Quantity_Per_Unit;
    @Column(name="unitprice")

    private Float Unit_Price;
    @Column(name="unitsinstock")

    private Integer Units_In_Stock;
    @Column(name="unitsonorder")

    private Integer Units_On_Order;
    @Column(name="reorderlevel")

    private Integer Reorder_Level;
    private Integer Discontinued;

    public Integer getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(Integer product_ID) {
        Product_ID = product_ID;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }

    public Integer getSupplier_id() {
        return Supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        Supplier_id = supplier_id;
    }

    public Integer getCategory_id() {
        return Category_id;
    }

    public void setCategory_id(Integer category_id) {
        Category_id = category_id;
    }

    public String getQuantity_Per_Unit() {
        return Quantity_Per_Unit;
    }

    public void setQuantity_Per_Unit(String quantity_Per_Unit) {
        Quantity_Per_Unit = quantity_Per_Unit;
    }

    public Float getUnit_Price() {
        return Unit_Price;
    }

    public void setUnit_Price(Float unit_Price) {
        Unit_Price = unit_Price;
    }

    public Integer getUnits_In_Stock() {
        return Units_In_Stock;
    }

    public void setUnits_In_Stock(Integer units_In_Stock) {
        Units_In_Stock = units_In_Stock;
    }

    public Integer getUnits_On_Order() {
        return Units_On_Order;
    }

    public void setUnits_On_Order(Integer units_On_Order) {
        Units_On_Order = units_On_Order;
    }

    public Integer getRecorded_Level() {
        return Reorder_Level;
    }

    public void setRecorded_Level(Integer recorded_Level) {
        Reorder_Level = recorded_Level;
    }

    public Integer getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(Integer discontinued) {
        Discontinued = discontinued;
    }
}




