package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_20 {
    private final Production83_20 production = new Production83_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}