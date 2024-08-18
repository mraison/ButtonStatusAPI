package com.PanicStatus.API;

import com.PanicStatus.API.StateTBL;
import com.PanicStatus.API.PanicStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanicStatusService {

    @Autowired
    private PanicStatusRepository panicStatusRepository;

    // read operation
    public List<StateTBL> fetchStatuses() {
        return (List<StateTBL>) panicStatusRepository.findAll();
    }

    public List<StateTBL> fetchStatus() {
        return (List<StateTBL>) panicStatusRepository.findLast();
    }
}