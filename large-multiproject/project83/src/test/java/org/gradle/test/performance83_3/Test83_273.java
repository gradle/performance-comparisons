package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_273 {
    private final Production83_273 production = new Production83_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}