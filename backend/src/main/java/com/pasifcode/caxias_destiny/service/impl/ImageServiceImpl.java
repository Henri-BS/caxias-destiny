package com.pasifcode.caxias_destiny.service.impl;

import com.pasifcode.caxias_destiny.domain.entity.Image;
import com.pasifcode.caxias_destiny.domain.enums.ImageExtension;
import com.pasifcode.caxias_destiny.infra.repository.ImageRepository;
import com.pasifcode.caxias_destiny.service.interf.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    @Transactional
    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public List<Image> searchImage(ImageExtension extension, String query){
        return imageRepository.findByExtensionAndNameLike(extension, query);
    }

    @Override
    public Optional<Image> getImage(String id){
        return imageRepository.findById(id);
    }
}
