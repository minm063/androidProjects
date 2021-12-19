package com.example.roomdatabaseexample;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1) // version : 변경사항에 대한 관리
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao(); // 인터페이스에서 만든 userDao
}
