package com.thonysupersonic.redditclient.view.utilities;

import android.util.Log;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class FunctionsTest {

    @Test
    public void convertUTCTime() {
        int uptimeMils = 1536498497 ;
        String tiempoTranscurrido = Functions.convertUTCTime(uptimeMils);
        assertEquals("8 hours ago", tiempoTranscurrido);
    }
}