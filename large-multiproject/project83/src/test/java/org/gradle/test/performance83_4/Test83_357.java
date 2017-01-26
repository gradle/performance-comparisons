package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_357 {
    private final Production83_357 production = new Production83_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}