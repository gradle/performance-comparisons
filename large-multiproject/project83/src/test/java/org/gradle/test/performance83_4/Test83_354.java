package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_354 {
    private final Production83_354 production = new Production83_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}