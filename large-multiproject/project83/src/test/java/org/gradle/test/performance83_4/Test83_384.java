package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_384 {
    private final Production83_384 production = new Production83_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}