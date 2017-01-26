package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_443 {
    private final Production83_443 production = new Production83_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}