package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String province_name;

    public Customer(String fullName, String email, String phone) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
    }

    public Customer(String fullName, String email, String phone, String province_name) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.province_name = province_name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", province_name='" + province_name + '\'' +
                '}';
    }
}
