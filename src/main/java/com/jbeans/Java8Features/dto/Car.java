
package com.jbeans.Java8Features.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
        name = "car_data"
)
public class Car {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "Cust_id",
            nullable = false
    )
    private Long id;
    @Column(
            name = "mpg"
    )
    int mpg;
    @Column(
            name = "cylinders"
    )
    int cylinders;
    @Column(
            name = "displacement"
    )
    int displacement;
    @Column(
            name = "horsepower"
    )
    int horsepower;
    @Column(
            name = "weight"
    )
    int weight;
    @Column(
            name = "acceleration"
    )
    double acceleration;
    @Column(
            name = "model_year"
    )
    int model_year;
    @Column(
            name = "origin"
    )
    String origin;
    @Column(
            name = "Name"
    )
    String Name;
    @Column(
            name = "Model"
    )
    String Model;
    @Column(
            name = "Price"
    )
    double Price;

    public Car() {
    }

    public Long getId() {
        return this.id;
    }

    public int getMpg() {
        return this.mpg;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public int getWeight() {
        return this.weight;
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public int getModel_year() {
        return this.model_year;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getName() {
        return this.Name;
    }

    public String getModel() {
        return this.Model;
    }

    public double getPrice() {
        return this.Price;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setMpg(final int mpg) {
        this.mpg = mpg;
    }

    public void setCylinders(final int cylinders) {
        this.cylinders = cylinders;
    }

    public void setDisplacement(final int displacement) {
        this.displacement = displacement;
    }

    public void setHorsepower(final int horsepower) {
        this.horsepower = horsepower;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public void setAcceleration(final double acceleration) {
        this.acceleration = acceleration;
    }

    public void setModel_year(final int model_year) {
        this.model_year = model_year;
    }

    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public void setName(final String Name) {
        this.Name = Name;
    }

    public void setModel(final String Model) {
        this.Model = Model;
    }

    public void setPrice(final double Price) {
        this.Price = Price;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Car(id=" + var10000 + ", mpg=" + this.getMpg() + ", cylinders=" + this.getCylinders() + ", displacement=" + this.getDisplacement() + ", horsepower=" + this.getHorsepower() + ", weight=" + this.getWeight() + ", acceleration=" + this.getAcceleration() + ", model_year=" + this.getModel_year() + ", origin=" + this.getOrigin() + ", Name=" + this.getName() + ", Model=" + this.getModel() + ", Price=" + this.getPrice() + ")";
    }
}
