package com.example.assignment.db.northwindassignment.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class customer {
    @Id
    private String Customer_Id;
    private String Company_Name;
    private String Contact_Name;
    private String Contact_Title;
    private String Address;
    private String City;
    private String Region;
    private String Postal_Code;
    @Column(name="Country")
    private String Country;
    @Column(name="Phone")
    private String Phone;
    @Column(name="Fax")
    private String Fax;
//    public customer(){};

    public String getCustomerId() {
        return Customer_Id;
    }

    public void setCustomerId(String customerId) {
        Customer_Id = customerId;
    }

    public String getCompanyName() {
        return Company_Name;
    }

    public void setCompanyName(String companyName) {
        Company_Name = companyName;
    }

    public String getContactName() {
        return Contact_Name;
    }

    public void setContactName(String contactName) {
        Contact_Name = contactName;
    }

    public String getContactTitle() {
        return Contact_Title;
    }

    public void setContactTitle(String contactTitle) {
        Contact_Title = contactTitle;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPostalCode() {
        return Postal_Code;
    }

    public void setPostalCode(String postalCode) {
        Postal_Code = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }
}
