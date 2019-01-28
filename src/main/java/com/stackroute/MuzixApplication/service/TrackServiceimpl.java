package com.stackroute.MuzixApplication.service;

import com.stackroute.MuzixApplication.domain.Track;
import com.stackroute.MuzixApplication.exception.IdNotFoundException;
import com.stackroute.MuzixApplication.exception.TracNotFoundException;
import com.stackroute.MuzixApplication.exception.TrackAlreadyExistsException;
import com.stackroute.MuzixApplication.repository.TrackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceimpl implements TrackService {

    TrackRepository trackRepositroy;

    @Autowired
    public TrackServiceimpl(TrackRepository trackRepositroy) {
        this.trackRepositroy = trackRepositroy;
    }

    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistsException{
        if(trackRepositroy.existsById(track.getId()))
        {
            throw new TrackAlreadyExistsException("Track already exists");
        }
        Track savedTrack=trackRepositroy.save(track);
        if (savedTrack == null) {

            throw new TrackAlreadyExistsException("Track already exists");
        }
        return savedTrack;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepositroy.findAll();
    }

    @Override
    public boolean deleteTrack(int id) throws TracNotFoundException {
      //return null;
        boolean status=false;
        if(trackRepositroy.existsById(id))
        {
            trackRepositroy.deleteById(id);
            status=true;
            return status;
        }
        else
        {

                throw new TracNotFoundException("Track not found");
        }


    }
   @Override
    public Track updateTrack(Track track) throws IdNotFoundException {
       if(trackRepositroy.existsById(track.getId()))
       {

           Track updateTrack=trackRepositroy.save(track);
           return updateTrack;


       }

       else {

           throw new IdNotFoundException("ID doesnt exist");
       }



    }


    }


