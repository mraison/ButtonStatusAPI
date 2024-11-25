package com.PanicStatus.API;

import java.util.UUID;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.cassandra.repository.CassandraRepository;
import com.PanicStatus.API.StateTBL;

@Repository
public interface PanicStatusRepository extends CassandraRepository<StateTBL, UUID> {

    @Query("SELECT * from panicButton.statetbl where device = 1 order by id desc limit 1")
    public List<StateTBL> findLast();
}