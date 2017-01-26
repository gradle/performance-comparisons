package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_429 {
    private final Production83_429 production = new Production83_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}