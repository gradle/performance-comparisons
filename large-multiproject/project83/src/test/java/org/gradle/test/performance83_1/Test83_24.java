package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_24 {
    private final Production83_24 production = new Production83_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}