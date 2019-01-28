//package com.stackroute.MuzixApplication.FeedComponent;
//
//
//import com.stackroute.MuzixApplication.domain.Track;
//import com.stackroute.MuzixApplication.service.TrackService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FeedDataAppStartRunner implements ApplicationRunner {
//
//    private Track feedTrackData = new Track();
//
//    /* @Value("${song.total}")
//     private int totalSongs;*/
//    @Value("${song.1.id}")
//    private int id1;
//    @Value("${song.1.name}")
//    private String name1;
//    @Value("${song.1.comment}")
//    private String comment1;
//    @Value("${song.2.id}")
//    private int id2;
//    @Value("${song.2.name}")
//    private String name2;
//    @Value("${song.2.comment}")
//    private String comment2;
//    @Value("${song.3.id}")
//    private int id3;
//    @Value("${song.3.name}")
//    private String name3;
//    @Value("${song.3.comment}")
//    private String comment3;
//    @Value("${song.4.id}")
//    private int id4;
//    @Value("${song.4.name}")
//    private String name4;
//    @Value("${song.4.comment}")
//    private String comment4;
//    @Autowired
//    private TrackService trackServices;
//
//    public FeedDataAppStartRunner(TrackService trackServices) {
//        this.trackServices = trackServices;
//    }
//
//    //TODO: Add all feeder data to a file, don't let it be hardcoded
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        feedTrackData.setId(id1);
//        feedTrackData.setName(name1);
//        feedTrackData.setComment(comment1);
//        trackServices.saveTrack(feedTrackData);
//
//        feedTrackData.setId(id2);
//        feedTrackData.setName(name2);
//        feedTrackData.setComment(comment2);
//        trackServices.saveTrack(feedTrackData);
//
//        feedTrackData.setId(id3);
//        feedTrackData.setName(name3);
//        feedTrackData.setComment(comment3);
//        trackServices.saveTrack(feedTrackData);
//
//        feedTrackData.setId(id4);
//        feedTrackData.setName(name4);
//        feedTrackData.setComment(comment4);
//        trackServices.saveTrack(feedTrackData);
//
//
//
//    }
//}