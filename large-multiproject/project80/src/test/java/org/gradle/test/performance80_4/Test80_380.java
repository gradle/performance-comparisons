package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_380 {
    private final Production80_380 production = new Production80_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}