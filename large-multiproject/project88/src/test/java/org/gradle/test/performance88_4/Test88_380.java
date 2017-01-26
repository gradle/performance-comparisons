package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_380 {
    private final Production88_380 production = new Production88_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}