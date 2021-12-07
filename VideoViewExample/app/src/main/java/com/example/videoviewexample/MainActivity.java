package com.example.videoviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView; // 비디오 실행 뷰
    private MediaController mediaController; // 재생이나 정지와 같은 미디어 제어 버튼부를 담당
//    private String videoURL = "https://www.radiantmediaplayer.com/media/bbb-360p.mp4";
    private String videoURL = "https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4";



    // 앱이 첫 실행됐을 때 onCreate을 수행한다
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        // URI(Uniform resource identifier), Your name
        // provides a technique for defining the identity of an item
        //is used to distinguish one resource from other regardless of the method used
        // URL(Uniform resource locator), Your address
        Uri uri = Uri.parse(videoURL);
        videoView.setMediaController(mediaController); // 미디어 제어 버튼부 세팅
        videoView.setVideoURI(uri); // 비디오 뷰의 주소를 설정
        videoView.start();
    }

}