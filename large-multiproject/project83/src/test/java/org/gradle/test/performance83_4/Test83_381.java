package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_381 {
    private final Production83_381 production = new Production83_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}