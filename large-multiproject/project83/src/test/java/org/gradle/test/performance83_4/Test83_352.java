package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_352 {
    private final Production83_352 production = new Production83_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}