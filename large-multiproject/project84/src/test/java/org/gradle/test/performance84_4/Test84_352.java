package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_352 {
    private final Production84_352 production = new Production84_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}