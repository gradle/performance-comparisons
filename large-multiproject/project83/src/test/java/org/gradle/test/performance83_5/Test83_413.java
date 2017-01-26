package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_413 {
    private final Production83_413 production = new Production83_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}