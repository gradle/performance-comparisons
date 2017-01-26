package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_284 {
    private final Production83_284 production = new Production83_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}