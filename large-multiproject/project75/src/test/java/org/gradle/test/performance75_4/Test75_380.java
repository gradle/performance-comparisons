package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_380 {
    private final Production75_380 production = new Production75_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}