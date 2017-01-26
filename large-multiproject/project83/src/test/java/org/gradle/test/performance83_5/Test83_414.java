package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_414 {
    private final Production83_414 production = new Production83_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}