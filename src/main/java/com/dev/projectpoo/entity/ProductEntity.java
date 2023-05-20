package com.dev.projectpoo.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mt_product")
public class ProductEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "product_id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "price")
        private int price;

        @Column(name = "stock")
        private int stock;

        @Column(name = "date")
        private Date firstDate = new Date();;

        public ProductEntity() {
        }

        public ProductEntity(Long id, String name, int price, int stock, Date firstDate) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.stock = stock;
            this.firstDate = firstDate;
        }

        public Long getId() {

            return id;
        }

        public void setId(Long id) {

            this.id = id;
        }

        public Date getDate(){

            return firstDate;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getPrice() {

            return price;
        }

        public void setPrice(int price) {

            this.price = price;
        }

        public int getStock() {

            return stock;
        }

        public void setStock(int stock) {

            this.stock = stock;
        }

}

