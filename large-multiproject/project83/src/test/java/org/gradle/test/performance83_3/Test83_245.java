package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_245 {
    private final Production83_245 production = new Production83_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}