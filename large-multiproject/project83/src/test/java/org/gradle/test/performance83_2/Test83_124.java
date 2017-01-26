package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_124 {
    private final Production83_124 production = new Production83_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}