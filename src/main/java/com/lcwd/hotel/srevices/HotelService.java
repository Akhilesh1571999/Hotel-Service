package com.lcwd.hotel.srevices;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotel();

     Hotel get(String id);

}
