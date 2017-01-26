package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_368 {
    private final Production83_368 production = new Production83_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}