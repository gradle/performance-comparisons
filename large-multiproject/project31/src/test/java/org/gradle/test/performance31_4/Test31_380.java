package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_380 {
    private final Production31_380 production = new Production31_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}