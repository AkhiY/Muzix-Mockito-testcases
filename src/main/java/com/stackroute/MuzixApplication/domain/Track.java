package com.stackroute.MuzixApplication.domain;

import lombok.*;
import org.springframework.data.annotation.Id;







@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Track {

    @Id
    private int id;
    private String name;
    private String comment;


}
