package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_332 {
    private final Production83_332 production = new Production83_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}