package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_194 {
    private final Production83_194 production = new Production83_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}