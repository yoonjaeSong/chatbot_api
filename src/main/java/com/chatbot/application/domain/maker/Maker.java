package com.chatbot.application.domain.maker;

import com.chatbot.application.domain.car.Car;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Maker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int no;

    @Column(length = 50)
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "maker_id")
    private List<Car> cars = new ArrayList<>();

    @Builder
    public Maker(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
