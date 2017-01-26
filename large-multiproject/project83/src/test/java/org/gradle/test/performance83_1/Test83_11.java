package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_11 {
    private final Production83_11 production = new Production83_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}