package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_345 {
    private final Production83_345 production = new Production83_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}