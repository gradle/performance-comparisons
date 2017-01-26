package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_467 {
    private final Production83_467 production = new Production83_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}