package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_141 {
    private final Production83_141 production = new Production83_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}