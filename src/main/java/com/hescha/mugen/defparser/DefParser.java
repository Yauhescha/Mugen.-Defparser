package com.hescha.mugen.defparser;

import com.hescha.mugen.defparser.model.DefBlock;
import com.hescha.mugen.defparser.model.DefFile;
import lombok.SneakyThrows;

import java.io.File;
import java.util.Scanner;

public class DefParser {
    public DefFile parse(String filepath) {
        return parse(new File(filepath));
    }

    @SneakyThrows
    private DefFile parse(File file) {
        DefFile defFile = new DefFile();
        DefBlock block = null;

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.startsWith(";") || line.isEmpty()) continue;

            if (line.startsWith("[")) {
                line = line.substring(1, line.length() - 1);
                block = new DefBlock();
                block.setName(line);

                defFile.getBlocks().add(block);
                continue;
            }

            if (line.contains(";")) {
                line = line.substring(0, line.indexOf(";"));
            }

            int i = line.indexOf("=");
            String substring1 = line.substring(0, i).trim();
            String substring2 = line.substring(i + 1, line.length()).trim();
            block.getItems().put(substring1, substring2);
        }

        return defFile;
    }
}
