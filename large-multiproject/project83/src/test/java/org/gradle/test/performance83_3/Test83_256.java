package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_256 {
    private final Production83_256 production = new Production83_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}