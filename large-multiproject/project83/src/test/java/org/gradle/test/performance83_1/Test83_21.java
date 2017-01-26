package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_21 {
    private final Production83_21 production = new Production83_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}