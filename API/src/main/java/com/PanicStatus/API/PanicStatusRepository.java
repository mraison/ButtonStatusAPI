package com.PanicStatus.API;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Query;
import org.springframework.stereotype.Repository;
import com.PanicStatus.API.StateTBL;

@Repository
public interface PanicStatusRepository extends CrudRepository<StateTBL, UUID> {

//    @Query("from Auction a join a.category c where c.name=:categoryName")
//    public StateTBL findLast() {
//
//    }
}