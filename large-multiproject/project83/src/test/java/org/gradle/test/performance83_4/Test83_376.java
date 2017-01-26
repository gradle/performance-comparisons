package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_376 {
    private final Production83_376 production = new Production83_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}