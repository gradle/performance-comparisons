package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_380 {
    private final Production41_380 production = new Production41_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}