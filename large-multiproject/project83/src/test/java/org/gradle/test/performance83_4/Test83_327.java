package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_327 {
    private final Production83_327 production = new Production83_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}