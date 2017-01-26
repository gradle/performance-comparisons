package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_489 {
    private final Production83_489 production = new Production83_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}