package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_402 {
    private final Production83_402 production = new Production83_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}