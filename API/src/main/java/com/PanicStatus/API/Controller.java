package com.PanicStatus.API;

import java.util.List;
import java.lang.String;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
class PanicStatusController {

    @Autowired
    private PanicStatusService panicStatusService;

    @GetMapping("/statuses")
    public @ResponseBody List<StateTBL> allStatuses() {
        return panicStatusService.fetchStatuses();
    }

    @GetMapping("/status")
    public @ResponseBody List<StateTBL> currStatus() {
        return panicStatusService.fetchStatus();
    }

}
