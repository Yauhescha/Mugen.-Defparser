package com.hescha.mugen.defparser.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DefBlock {
    private String name;
    private Map<String, String> items = new HashMap<>();
}
