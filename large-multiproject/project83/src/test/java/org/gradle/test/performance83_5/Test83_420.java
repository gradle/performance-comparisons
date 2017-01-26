package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_420 {
    private final Production83_420 production = new Production83_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}