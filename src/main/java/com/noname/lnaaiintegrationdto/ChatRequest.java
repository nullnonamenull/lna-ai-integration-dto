package com.noname.lnaaiintegrationdto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ChatRequest {

    private String model;
    private List<Message> messages;

}