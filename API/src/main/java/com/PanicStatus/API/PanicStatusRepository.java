package com.PanicStatus.API;

import java.util.UUID;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.RepositoryQuery;
import org.springframework.stereotype.Repository;
import org.springframework.data.cassandra.repository.Query;
import com.PanicStatus.API.StateTBL;

@Repository
public interface PanicStatusRepository extends CrudRepository<StateTBL, UUID> {

    @Query("SELECT * from panicButton.statetbl where device = 1 order by id desc limit 1")
    public List<StateTBL> findLast();
}