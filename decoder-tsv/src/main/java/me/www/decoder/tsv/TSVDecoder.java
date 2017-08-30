package me.www.decoder.tsv;

import me.www.decoder.service.Decode;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Tab-separated value decode
 * Created by www on 2017/8/30 0030.
 */
public class TSVDecoder implements Decode {

    private static final String DELIMITER = Character.toString('\t');

    @Override
    public boolean isEncodingNameSupported(String encodingName) {
        return "text/tsv".equalsIgnoreCase(encodingName.trim());
    }

    @Override
    public String[] getContent(String data) {
        List<String> values = new LinkedList<>();

        StringTokenizer parser = new StringTokenizer(data, DELIMITER);
        while (parser.hasMoreTokens()) {
            values.add(parser.nextToken());
        }

        return values.toArray(new String[values.size()]);
    }

}