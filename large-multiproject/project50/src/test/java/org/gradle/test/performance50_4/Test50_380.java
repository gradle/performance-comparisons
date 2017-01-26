package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_380 {
    private final Production50_380 production = new Production50_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}