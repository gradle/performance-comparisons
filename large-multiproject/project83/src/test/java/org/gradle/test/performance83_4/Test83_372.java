package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_372 {
    private final Production83_372 production = new Production83_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}