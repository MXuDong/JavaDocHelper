package com.mxudong.dochelper.common;

import b.h.P;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dong
 * @since 1.0
 */

public class DescriptionItem {

    private String document;

    private final static Pattern DESC_PATTERN = Pattern.compile("\\n\\s*\\*\\s*([^\\n]*)");

    public DescriptionItem(String document) {
        this.document = document;
    }

    public String getDescInfo(){
        Matcher matcher = DESC_PATTERN.matcher(document);
        StringBuilder result = new StringBuilder();
        while (matcher.find()){
            int length = matcher.groupCount();
            for(int i = 0; i < length; i++){
                String line = matcher.group(i + 1);
                line = line.replaceAll("<p>", "\n\n");
                line = line.replaceAll("<\\\\p>", "\n\n");
                result.append(line);
            }
        }
        return result.toString().replaceAll("\\{[^}]*}", " ");
    }
}
