package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_236 {
    private final Production83_236 production = new Production83_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}