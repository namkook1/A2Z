package com.a2z.bill.domain.SRInfos;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class SRInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String srId;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String srName;

    @Builder
    public SRInfo(String srId, String srName) {
        this.srId = srId;
        this.srName = srName;
    }

}
