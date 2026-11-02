package com.HotelManagement.service;

import com.HotelManagement.entity.Hotel;
import com.HotelManagement.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository){
        this.hotelRepository=hotelRepository;
    }

    public Hotel addHotel(Hotel hotel)
    {
        return hotelRepository.save(hotel);
    }

    public Hotel getHotelById(Long id)
    {
        return hotelRepository.findById(id).orElseThrow(() -> new RuntimeException("Hotel not found"));

    }

    public List<Hotel> getAllHotels()
    {
        return hotelRepository.findAll();
    }

   public Hotel updateHotel(Long id , Hotel hotel)
   {
       Hotel existing=hotelRepository.findById(id).orElseThrow(() -> new RuntimeException("Hotel not found"));
       existing.setHotelName(hotel.getHotelName());
       existing.setCity(hotel.getCity());
       existing.setRating(hotel.getRating());
       existing.setAvailableRooms(hotel.getAvailableRooms());

       return hotelRepository.save(existing);
   }

   public void deleteHotel(Long id)
   {
       Hotel existing=hotelRepository.findById(id).orElseThrow(()->new RuntimeException("Hotel not found"));
       hotelRepository.delete(existing);
   }

}
