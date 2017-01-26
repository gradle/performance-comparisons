package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_487 {
    private final Production83_487 production = new Production83_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}