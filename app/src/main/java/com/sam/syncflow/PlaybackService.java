package com.sam.syncflow;
import androidx.media3.common.*;import androidx.media3.exoplayer.ExoPlayer;import androidx.media3.session.*;
public class PlaybackService extends MediaSessionService {
 ExoPlayer player; MediaSession session;
 public void onCreate(){super.onCreate();player=new ExoPlayer.Builder(this).build();player.setAudioAttributes(new AudioAttributes.Builder().setUsage(C.USAGE_MEDIA).setContentType(C.AUDIO_CONTENT_TYPE_MUSIC).build(),true);session=new MediaSession.Builder(this,player).build();}
 public MediaSession onGetSession(MediaSession.ControllerInfo info){return session;}
 public void onDestroy(){if(session!=null)session.release();if(player!=null)player.release();super.onDestroy();}
}