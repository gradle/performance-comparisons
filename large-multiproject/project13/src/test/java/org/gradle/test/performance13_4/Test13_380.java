package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_380 {
    private final Production13_380 production = new Production13_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}