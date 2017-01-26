package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_459 {
    private final Production83_459 production = new Production83_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}