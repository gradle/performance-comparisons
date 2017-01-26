package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_258 {
    private final Production83_258 production = new Production83_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}