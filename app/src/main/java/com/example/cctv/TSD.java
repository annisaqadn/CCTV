package com.example.cctv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.PlayerView;


public class TSD extends AppCompatActivity {
    PlayerView viewcctv;
    ExoPlayer exoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsd);
        viewcctv = findViewById(R.id.exoplayer);

        exoPlayer = new ExoPlayer.Builder(this).build();
        viewcctv.setPlayer(exoPlayer);

        //String video ="https://mam.jogjaprov.go.id:1937/atcs-kota/SimpangAmongrogoTimur.stream/playlist.m3u8";

        String video = "http://103.141.234.194:8080/live/tugu-selamat-datang-patuk.flv";
        MediaItem mediaItem = MediaItem.fromUri(video);
        exoPlayer.addMediaItem(mediaItem);
        exoPlayer.prepare();
        exoPlayer.setPlayWhenReady(true);
    }
}
