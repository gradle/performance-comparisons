package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_13 {
    private final Production83_13 production = new Production83_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}