package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_380 {
    private final Production35_380 production = new Production35_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}