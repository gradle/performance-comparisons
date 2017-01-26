package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_240 {
    private final Production83_240 production = new Production83_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}