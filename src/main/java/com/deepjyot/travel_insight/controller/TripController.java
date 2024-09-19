package com.deepjyot.travel_insight.controller;


import com.deepjyot.travel_insight.dto.FlightReservationResponse;
import com.deepjyot.travel_insight.dto.TripPlan;
import com.deepjyot.travel_insight.dto.TripReservationRequest;
import com.deepjyot.travel_insight.service.TripPlanService;
import com.deepjyot.travel_insight.service.TripReservationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trip")
@RequiredArgsConstructor
public class TripController {

    private static final Logger log = LoggerFactory.getLogger(TripController.class);
    private final TripPlanService planService;
    private final TripReservationService reservationService;

    @GetMapping("{airportCode}")
    public TripPlan planTrip(@PathVariable String airportCode){

//        log.info("airport code is: {}, is Virtual: {}" , airportCode, Thread.currentThread().isVirtual());
        return this.planService.getTripPlan(airportCode);
    }

    @PostMapping("reserve")
    public FlightReservationResponse reserveFlight(@RequestBody TripReservationRequest request){
        return this.reservationService.reserve(request);
    }

}
