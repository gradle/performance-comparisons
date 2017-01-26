package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_221 {
    private final Production83_221 production = new Production83_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}