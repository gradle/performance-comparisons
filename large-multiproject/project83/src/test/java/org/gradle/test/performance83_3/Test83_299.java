package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_299 {
    private final Production83_299 production = new Production83_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}