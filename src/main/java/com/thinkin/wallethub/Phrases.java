package com.thinkin.wallethub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Phrases {
    static final int defaultLimit = 10000;

    private Map<String, Integer> getTopPhrases(InputStream inputStream, int limit) {
        Map<String, Integer> map = new LinkedHashMap<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                String[] linePhrase = line.split("\\|");
                for (String phrase : linePhrase) {
                    if (map.containsKey(phrase)) {
                        map.put(phrase, map.get(phrase).intValue() + 1);
                    } else {
                        map.put(phrase, 1);
                    }
                }

            }
            map = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(limit).collect(
                    Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}
