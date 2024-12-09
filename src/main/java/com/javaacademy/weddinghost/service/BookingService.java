package com.javaacademy.weddinghost.service;

import com.javaacademy.weddinghost.dto.FreeDaysCountDto;
import com.javaacademy.weddinghost.entity.Booking;
import com.javaacademy.weddinghost.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;

    public void addBooking(Booking booking) {
        booking.setBooked(true);
        bookingRepository.save(booking);
    }

    public List<Booking> findBookingByMonth(int month) {
        return bookingRepository.getAll().stream()
                .filter(booking -> booking.getMonth() == month)
                .collect(Collectors.toList());
    }

    public FreeDaysCountDto freeDaysCount(int month) {
        long count = bookingRepository.getBookingsByMonth(month).stream().filter(Booking::isBooked).count();
        return new FreeDaysCountDto(count);
    }
}
