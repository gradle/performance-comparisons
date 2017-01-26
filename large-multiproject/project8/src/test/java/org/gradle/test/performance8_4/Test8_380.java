package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_380 {
    private final Production8_380 production = new Production8_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}