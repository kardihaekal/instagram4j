package com.github.instagram4j.Instagram4J.requests.media;

import com.github.instagram4j.Instagram4J.models.IGPayload;
import com.github.instagram4j.Instagram4J.requests.IGPostRequest;
import com.github.instagram4j.Instagram4J.responses.IGResponse;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IGMediaSaveRequest extends IGPostRequest<IGResponse> {
    @NonNull
    private String id;

    @Override
    protected IGPayload getPayload() {
        return new IGPayload() {
            @Getter
            private String media_id = id;
        };
    }

    @Override
    public String path() {
        return "media/" + id + "/save/";
    }

    @Override
    public Class<IGResponse> getResponseType() {
        return IGResponse.class;
    }

}