package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_262 {
    private final Production83_262 production = new Production83_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}