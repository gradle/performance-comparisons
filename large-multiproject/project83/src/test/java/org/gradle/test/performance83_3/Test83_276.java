package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_276 {
    private final Production83_276 production = new Production83_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}