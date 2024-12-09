package com.javaacademy.weddinghost.repository;

import com.javaacademy.weddinghost.entity.Booking;
import com.javaacademy.weddinghost.storage.BookingStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BookingRepository {
    private final BookingStorage bookingStorage;

    public void save(Booking booking) {
        bookingStorage.addBooking(booking);
    }

    public List<Booking> getAll() {
        return bookingStorage.getAllBookings();
    }

    public List<Booking> getBookingsByMonth(int month) {
        return bookingStorage.getBookingsByMonth(month);
    }
}
