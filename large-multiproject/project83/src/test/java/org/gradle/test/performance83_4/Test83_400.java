package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_400 {
    private final Production83_400 production = new Production83_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}