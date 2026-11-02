package com.HotelManagement.service;

import com.HotelManagement.entity.Hotel;

import java.util.List;

public interface HotelService{

    Hotel addHotel(Hotel hotel);

    Hotel getHotelById(Long id);

    List<Hotel> getAllHotels();

    Hotel updateHotel(Long id, Hotel hotel);

    void deleteHotel(Long id);
}
