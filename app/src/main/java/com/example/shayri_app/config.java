package com.example.shayri_app;

import android.os.Environment;

import java.io.File;

public class config
{
    static int gradientArr[] = new int[]{R.drawable.bg1, R.drawable.bg2, R.drawable.bg3, R.drawable.bg4, R.drawable.bg5, R.drawable.bg6,
            R.drawable.bg7, R.drawable.bg8, R.drawable.bg9, R.drawable.bg10};
    static int[] colorarr = {R.color.a1,R.color.a2,R.color.a3,R.color.a4,R.color.a5,R.color.a6,R.color.a7,
            R.color.a8,R.color.a9,R.color.a10,R.color.a11,R.color.a12,R.color.a13,R.color.a14,
            R.color.a15,R.color.a16,R.color.a17,R.color.a18,R.color.a19,R.color.a20,R.color.a21,
            R.color.a22,R.color.a23,R.color.a24,R.color.a25,R.color.a26,R.color.a27,R.color.a28,
            R.color.a29,R.color.a30,R.color.a31,R.color.a32,R.color.a33,R.color.a34,R.color.a35};

    static int[] colorarr2 = {R.color.a5,R.color.a6,R.color.a7,
            R.color.a8,R.color.a9,R.color.a10,R.color.a11,R.color.a12,R.color.a13,R.color.a14,
            R.color.a15,R.color.a16,R.color.a17,R.color.a18,R.color.a19,R.color.a20,R.color.a21,
            R.color.a22,R.color.a23,R.color.a24,R.color.a25,R.color.a26,R.color.a27,R.color.a28,
            R.color.a29,R.color.a30,R.color.a31,R.color.a32,R.color.a33,R.color.a34,R.color.a35,R.color.a1,R.color.a2,R.color.a3,R.color.a4};

    static  String fonts[] = {"AGENCYB.TTF","AGENCYR.TTF","BAUHS93.TTF","BOD_PSTC.TTF","BRADHITC.TTF","BRUSHSCI.TTF",
            "COOPBL.TTF","FORTE.TTF","FRABK.TTF","FRABKIT.TTF","GILLUBCD.TTF","GILSANUB.TTF","GOUDYSTO.TTF","HARLOWSI.TTF"};

    static String emoji[] = {"😀😁😂🤣😃😄","😋😊😉😆😅😍","😘🥰😗😙🥲🤔","🤩🤗🙂☺😚🤨","😐😑😶😶‍🌫️🙄","😯🤐😮😥😣😏","❣💕💞💓💗💖","❤️🧡💛💚💙💜"};

    static File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
}
