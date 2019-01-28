package com.stackroute.MuzixApplication.controller;

import com.stackroute.MuzixApplication.domain.Track;
import com.stackroute.MuzixApplication.exception.IdNotFoundException;
import com.stackroute.MuzixApplication.exception.TracNotFoundException;
import com.stackroute.MuzixApplication.exception.TrackAlreadyExistsException;
import com.stackroute.MuzixApplication.repository.TrackRepository;
import com.stackroute.MuzixApplication.service.TrackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping(value = "/api/v1")
public class TrackController {
    TrackRepository trackRepository;

    ResponseEntity responseEntity;
    private TrackService trackService;

    private Track track1 = new Track();

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }





    @PostMapping("/track")

    public ResponseEntity<?> saveTracks(@RequestBody Track track) throws TrackAlreadyExistsException

    {

            trackService.saveTrack(track);
            responseEntity = new ResponseEntity<String>("successfully created", HttpStatus.CREATED);
            return responseEntity;
    }

    @GetMapping("/track")
    public ResponseEntity<?> getAllTracks()
    {
        return new ResponseEntity<List<Track>>(trackService.getAllTracks(),HttpStatus.OK);
    }
    @PutMapping("/track")
    public ResponseEntity<?> updateTrack(@RequestBody Track track) throws IdNotFoundException
    {


            trackService.updateTrack(track);
            responseEntity = new ResponseEntity<String>("successfully updated", HttpStatus.CREATED);
        return responseEntity;
    }
    @DeleteMapping("/track/{id}")
    public ResponseEntity<?> deleteTrack(@PathVariable("id") int id)throws TracNotFoundException
    {

            trackService.deleteTrack(id);
            responseEntity = new ResponseEntity<String>("deleted successfully",HttpStatus.OK);
              return responseEntity;
    }









}
