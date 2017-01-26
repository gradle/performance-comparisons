package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_132 {
    private final Production83_132 production = new Production83_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}