package com.fastcampus.loan.service;

import java.nio.file.Path;
import java.util.stream.Stream;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    void save(Long applicationId, MultipartFile file); //파일을 업로드 하기 위한 메서드

    Resource load(Long applicationId, String file); //파일을 다운받기 위한 메서드

    void deleteAll(Long applicationId);

    Stream<Path> loadAll(Long applicationId);
}