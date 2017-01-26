package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_64 {
    private final Production83_64 production = new Production83_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}