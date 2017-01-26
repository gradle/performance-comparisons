package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_224 {
    private final Production83_224 production = new Production83_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}