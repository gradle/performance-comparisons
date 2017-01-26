package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_352 {
    private final Production31_352 production = new Production31_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}