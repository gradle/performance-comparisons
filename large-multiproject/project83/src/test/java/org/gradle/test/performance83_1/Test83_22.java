package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_22 {
    private final Production83_22 production = new Production83_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}