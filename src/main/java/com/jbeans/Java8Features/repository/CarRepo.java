
package com.jbeans.Java8Features.repository;

import com.jbeans.Java8Features.dto.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
