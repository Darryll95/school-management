package za.ac.cput.repository;
/*
        AddressRepository.java
        Address Repository Interface
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 15 June 2022
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Address;


import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends IRepository<Address, String> {
    List<Address> findAll();
}

