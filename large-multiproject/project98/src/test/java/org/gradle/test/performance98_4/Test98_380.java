package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_380 {
    private final Production98_380 production = new Production98_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}