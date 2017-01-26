package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_223 {
    private final Production83_223 production = new Production83_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}