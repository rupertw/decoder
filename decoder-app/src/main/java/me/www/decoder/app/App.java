package me.www.decoder.app;

import me.www.decoder.service.Decode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by www on 2017/8/30 0030.
 */
public class App {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //String encodeName = args[0];
        //String data = args[1];

        String encodeName = "text/csv";
        String data = "a,b,c,d";

        Decode decoder = DecodeFactory.getDecoder(encodeName);
        System.out.println(Arrays.toString(decoder.getContent(data)));
    }

}
