package com.dev.projectpoo.entity;
import javax.persistence.*;

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
        private String price;

        @Column(name = "stock")
        private String stock;


        public ProductEntity() {
        }

        public ProductEntity(Long id, String name, String price, String stock) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getStock() {
            return stock;
        }

        public void setStock(String stock) {
            this.stock = stock;
        }

}

