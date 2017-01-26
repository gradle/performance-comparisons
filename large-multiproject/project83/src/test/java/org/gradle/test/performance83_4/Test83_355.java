package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_355 {
    private final Production83_355 production = new Production83_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}