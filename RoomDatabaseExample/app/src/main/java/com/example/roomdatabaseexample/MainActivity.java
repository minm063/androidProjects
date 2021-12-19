package com.example.roomdatabaseexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UserDao mUserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDatabase database = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "Room_DB")
                .fallbackToDestructiveMigration() // 스키마(database) 버전 변경 가능
                .allowMainThreadQueries() // 메인 스레드에서 데이터베이스에 IO(입출력)을 가능하게 함
                .build();

        mUserDao = database.userDao(); // 인터페이스 객체 할당

        // 데이터 삽입
//        User user = new User(); // 새로운 객체 인스턴스 생성
//        user.setName("TEST");
//        user.setAge("25");
//        user.setPhoneNumber("01012345678");

//        mUserDao.setInsertUser(user); // 모델에 대해 삽입
        // app inspection 에서 테이블을 볼 수 있음

        List<User> userList = mUserDao.getUserAll();
        //데이터 조회
        for (int i = 0; i < userList.size(); i++) {
            Log.d("TEST", userList.get(i).getName() + "\n"
                    + userList.get(i).getAge() + "\n"
                    + userList.get(i).getPhoneNumber() + "\n");
        }

        // 데이터 수정
//        User user2 = new User(); // 새로운 객체 인스턴스 생성
//        user2.setId(1);
//        user2.setName("TEST_수정");
//        user2.setAge("50");
//        user2.setPhoneNumber("01087654321");
//        mUserDao.setUpdateUser(user2);

        // 데이터 삭제
        User user3 = new User();
        user3.setId(2);
        mUserDao.setDeleteUser(user3);
    }
}