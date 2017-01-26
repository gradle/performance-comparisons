package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_333 {
    private final Production83_333 production = new Production83_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}