//package com.stackroute.MuzixApplication.FeedComponent;
//
//import com.stackroute.MuzixApplication.domain.Track;
//import com.stackroute.MuzixApplication.service.TrackService;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
//@Component
//@Data
//@PropertySource("application.properties")
//public class FeedCommandLineRunner implements CommandLineRunner {
//    private Track feedTrackData = new Track();
//    @Value("${song.total}")
//    private int totalSongs;
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
//
//
//    @Autowired
//    Environment env;
//    @Autowired
//    private TrackService trackServices;
//    //TODO: Add all feeder data to a file, don't let it be hardcoded
//    //TODO: Find a better way to write expressions for @Value tag
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println(env.getProperty("app.name"));
//        System.out.println(env.getProperty("JAVA_HOME"));
//        feedTrackData.setId(id1);
//        feedTrackData.setName(name1);
//        feedTrackData.setComment(comment1);
//        trackServices.saveTrack(feedTrackData);
//        feedTrackData.setId(Integer.parseInt(env.getProperty("song.1.id")));
//        feedTrackData.setName(env.getProperty("song.1.name"));
//        feedTrackData.setComment(env.getProperty("song.1.comment"));
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
//    }
//}