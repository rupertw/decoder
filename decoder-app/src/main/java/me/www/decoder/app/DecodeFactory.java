package me.www.decoder.app;

import me.www.decoder.service.Decode;

import java.io.UnsupportedEncodingException;
import java.util.ServiceLoader;

/**
 * Created by www on 2017/8/30 0030.
 */
public class DecodeFactory {

    private static ServiceLoader<Decode> decodeSetLoader = ServiceLoader.load(Decode.class);

    public static Decode getDecoder(String encodingName) throws UnsupportedEncodingException {
        for (Decode decode : decodeSetLoader) {
            if (decode.isEncodingNameSupported(encodingName)) {
                return decode;
            }
        }

        throw new UnsupportedEncodingException();
    }

}
