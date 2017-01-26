package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_393 {
    private final Production57_393 production = new Production57_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}