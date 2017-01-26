package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_272 {
    private final Production83_272 production = new Production83_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}