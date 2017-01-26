package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_312 {
    private final Production83_312 production = new Production83_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}