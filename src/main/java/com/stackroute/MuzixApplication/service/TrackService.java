package com.stackroute.MuzixApplication.service;

import com.stackroute.MuzixApplication.domain.Track;

import com.stackroute.MuzixApplication.exception.IdNotFoundException;
import com.stackroute.MuzixApplication.exception.TracNotFoundException;
import com.stackroute.MuzixApplication.exception.TrackAlreadyExistsException;
import org.springframework.stereotype.Service;


import java.util.List;


public interface TrackService {
    public Track saveTrack(Track track)throws TrackAlreadyExistsException;
    public List<Track> getAllTracks();
    public boolean deleteTrack(int id)throws TracNotFoundException;
    public Track updateTrack(Track track) throws IdNotFoundException;



}
