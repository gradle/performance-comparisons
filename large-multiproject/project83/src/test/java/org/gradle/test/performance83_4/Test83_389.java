package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_389 {
    private final Production83_389 production = new Production83_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}