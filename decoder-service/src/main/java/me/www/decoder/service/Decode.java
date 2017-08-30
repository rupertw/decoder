package me.www.decoder.service;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
public interface Decode {

    boolean isEncodingNameSupported(String encodingName);

    String[] getContent(String data);

}
