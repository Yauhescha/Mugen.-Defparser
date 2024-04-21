package com.hescha.mugen.defparser.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DefFile {
    private List<DefBlock> blocks = new ArrayList<>();
}
