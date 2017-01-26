package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_399 {
    private final Production83_399 production = new Production83_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}