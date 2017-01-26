package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_448 {
    private final Production83_448 production = new Production83_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}