package com.dev.projectpoo.entity;
import javax.persistence.*;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "mt_product")
public class ProductEntity {

        @Id
        @Column(name = "product_id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "price")
        private double price;

        @Column(name = "stock")
        private int stock;

        @Column(name = "date")
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate= DateFor.format(date);

        public ProductEntity() {
        }

        public ProductEntity(Long id, String name, Double price, int stock, String stringDate) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.stock = stock;
            this.stringDate = stringDate;
        }

        public Long getId() {

            return id;
        }

        public void setId(Long id) {

            this.id = id;
        }

        public void setData(String stringDate){

            this.stringDate = stringDate;
        }

        public String getDate(){

            return stringDate;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public Double getPrice() {

            return price;
        }

        public void setPrice(Double price) {

            this.price = price;
        }

        public int getStock() {

            return stock;
        }

        public void setStock(int stock) {

            this.stock = stock;
        }
}

