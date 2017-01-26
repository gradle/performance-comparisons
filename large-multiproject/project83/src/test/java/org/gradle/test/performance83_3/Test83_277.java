package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_277 {
    private final Production83_277 production = new Production83_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}