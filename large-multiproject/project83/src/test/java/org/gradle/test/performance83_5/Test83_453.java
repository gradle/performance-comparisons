package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_453 {
    private final Production83_453 production = new Production83_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}