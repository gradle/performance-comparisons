package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_391 {
    private final Production83_391 production = new Production83_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}