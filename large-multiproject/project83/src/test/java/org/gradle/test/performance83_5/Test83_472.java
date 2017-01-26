package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_472 {
    private final Production83_472 production = new Production83_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}