package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_335 {
    private final Production83_335 production = new Production83_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}