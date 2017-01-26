package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_110 {
    private final Production83_110 production = new Production83_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}