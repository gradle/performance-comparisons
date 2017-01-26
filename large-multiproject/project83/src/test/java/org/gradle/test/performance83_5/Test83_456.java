package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_456 {
    private final Production83_456 production = new Production83_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}