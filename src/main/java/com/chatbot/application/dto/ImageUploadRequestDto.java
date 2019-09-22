package com.chatbot.application.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class ImageUploadRequestDto {

    private MultipartFile image;
    private int roomId;

    @Builder
    public ImageUploadRequestDto(MultipartFile image, int roomId) {
        this.image = image;
        this.roomId = roomId;
    }
}
