package com.example.roomdatabaseexample;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Room에서 지원하는 데이터 모델로써 활용
@Entity
public class User {
    @PrimaryKey(autoGenerate = true) // 사용자를 추가할때마다 id가 autoGenerate(1씩 카운팅하면서 상승)
    private int id = 0; // 하나의 사용자에 대한 교우 ID 값

    private String name;

    private String age;

    private String phoneNumber;

    // getter & setter (가져오거나 세팅을 하기 위한 준비 단계)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
