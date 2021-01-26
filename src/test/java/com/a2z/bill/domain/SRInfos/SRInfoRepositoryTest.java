package com.a2z.bill.domain.SRInfos;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SRInfoRepositoryTest {
    @Autowired
    SRInfoRepository srInfoRepository;

    @After
    public void cleanup() {
        //srInfoRepository.deleteAll();
    }

    @Test
    public void getSRInfo() {
        String srID = "DR-2020-12345";
        String srName = "개발과제";

        srInfoRepository.save(SRInfo.builder().srId(srID).srName(srName).build());


//        List<SRInfo> srInfoList = srInfoRepository.findAll();

//        SRInfo srInfo = srInfoList.get(0);
//        assertThat(srInfo.getSrId()).isEqualTo(srID);
    }
}
