package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_380 {
    private final Production48_380 production = new Production48_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}