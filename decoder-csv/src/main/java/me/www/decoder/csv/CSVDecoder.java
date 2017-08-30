package me.www.decoder.csv;

import me.www.decoder.service.Decode;

import java.text.DecimalFormatSymbols;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Comma-separated value decode
 * Created by www on 2017/8/30 0030.
 */
public class CSVDecoder implements Decode {

    private static final String DELIMITER = Character.toString(DecimalFormatSymbols.getInstance().getPatternSeparator());

    @Override
    public boolean isEncodingNameSupported(String encodingName) {
        return "text/csv".equalsIgnoreCase(encodingName.trim());
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