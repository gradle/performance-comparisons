package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_359 {
    private final Production83_359 production = new Production83_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}