package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_352 {
    private final Production75_352 production = new Production75_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}