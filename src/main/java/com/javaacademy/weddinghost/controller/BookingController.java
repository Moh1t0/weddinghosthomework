package com.javaacademy.weddinghost.controller;

import com.javaacademy.weddinghost.dto.FreeDaysCountDto;
import com.javaacademy.weddinghost.entity.Booking;
import com.javaacademy.weddinghost.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
@CrossOrigin
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/month/{month}")
    public List<Booking> getBookingByMonth(@PathVariable int month) {
        return bookingService.findBookingByMonth(month);
    }

    @PostMapping
    public void addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @GetMapping("/month/{month}/free")
    public FreeDaysCountDto getBookingFreeDaysCount(@PathVariable int month) {
        return bookingService.freeDaysCount(month);
    }
}
