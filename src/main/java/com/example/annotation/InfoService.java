package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class InfoService {
    private InfoRepository infoRepository;

    @Autowired
//    @Qualifier("partTimeEmployeeInfoRepo")
    public void setInfoRepository(InfoRepository ir) {
        this.infoRepository = ir;
    }

    public void showInfo() {
        infoRepository.getInfo();
    }
}
