package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_478 {
    private final Production83_478 production = new Production83_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}