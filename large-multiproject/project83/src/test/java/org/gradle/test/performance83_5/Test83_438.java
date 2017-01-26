package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_438 {
    private final Production83_438 production = new Production83_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}