package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_280 {
    private final Production83_280 production = new Production83_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}