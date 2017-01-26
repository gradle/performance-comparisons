package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_380 {
    private final Production40_380 production = new Production40_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}