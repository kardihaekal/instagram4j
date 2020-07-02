package com.github.instagram4j.Instagram4J.models.media.reel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.github.instagram4j.Instagram4J.models.media.IGImageVersions;
import com.github.instagram4j.Instagram4J.models.media.IGVideoVersionsMeta;

import lombok.Data;

@Data
@JsonTypeName("2")
public class IGReelVideoMedia extends IGReelMedia {
    private boolean has_audio;
    private int number_of_qualities;
    private double video_duration;
    private IGImageVersions image_versions2;
    private List<IGVideoVersionsMeta> video_versions;
}
