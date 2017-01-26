package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_352 {
    private final Production13_352 production = new Production13_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}