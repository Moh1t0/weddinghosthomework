package com.javaacademy.weddinghost.storage;

import com.javaacademy.weddinghost.entity.Booking;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookingStorage {
    private final List<Booking> data = new ArrayList<>();

    public void addBooking(Booking booking) {
        data.add(booking);
    }

    public List<Booking> getAllBookings() {
        return new ArrayList<>(data);
    }

    public List<Booking> getBookingsByMonth(int month) {
        return data.stream()
                .filter(booking -> booking.getMonth() == month)
                .collect(Collectors.toList());
    }
}
