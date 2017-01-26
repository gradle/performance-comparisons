package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_380 {
    private final Production84_380 production = new Production84_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}