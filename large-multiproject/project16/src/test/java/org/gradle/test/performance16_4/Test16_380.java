package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_380 {
    private final Production16_380 production = new Production16_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}