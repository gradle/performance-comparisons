package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_342 {
    private final Production83_342 production = new Production83_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}