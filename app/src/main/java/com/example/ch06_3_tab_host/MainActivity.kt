package com.example.ch06_3_tab_host

import android.app.TabActivity
import android.os.Bundle
import android.widget.TabHost
import android.widget.TabHost.TabSpec

@Suppress("deprecation")
class MainActivity : TabActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tab1 = tabHost.newTabSpec("TAB1").setIndicator("고양이")
        tab1.setContent(R.id.iv1)
        tabHost.addTab(tab1)

        var tab2 = tabHost.newTabSpec("TAB2").setIndicator("강쥐")
        tab2.setContent(R.id.iv2)
        tabHost.addTab(tab2)

        var tab3 = tabHost.newTabSpec("TAB3").setIndicator("토끼")
        tab3.setContent(R.id.iv3)
        tabHost.addTab(tab3)

        var tab4 = tabHost.newTabSpec("TAB4").setIndicator("말")
        tab4.setContent(R.id.iv4)
        tabHost.addTab(tab4)


//        var tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별")
//        tabSpecSong.setContent(R.id.tabSong)
//        tabHost.addTab(tabSpecSong)
//
//        var tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별")
//        tabSpecArtist.setContent(R.id.tabArtist)
//        tabHost.addTab(tabSpecArtist)
//
//        var tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별")
//        tabSpecAlbum.setContent(R.id.tabAlbum)
//        tabHost.addTab(tabSpecAlbum)

        tabHost.currentTab = 1
    }
}
