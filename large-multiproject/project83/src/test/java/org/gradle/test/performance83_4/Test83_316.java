package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_316 {
    private final Production83_316 production = new Production83_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}