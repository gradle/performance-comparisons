package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_470 {
    private final Production83_470 production = new Production83_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}