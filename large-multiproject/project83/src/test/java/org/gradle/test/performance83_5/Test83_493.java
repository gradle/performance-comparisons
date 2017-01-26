package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_493 {
    private final Production83_493 production = new Production83_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}