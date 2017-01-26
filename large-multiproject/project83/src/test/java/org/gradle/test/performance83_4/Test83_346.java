package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_346 {
    private final Production83_346 production = new Production83_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}