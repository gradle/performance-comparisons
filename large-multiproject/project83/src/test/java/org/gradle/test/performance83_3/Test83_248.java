package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_248 {
    private final Production83_248 production = new Production83_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}