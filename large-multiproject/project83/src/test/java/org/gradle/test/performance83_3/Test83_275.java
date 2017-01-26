package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_275 {
    private final Production83_275 production = new Production83_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}