package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_341 {
    private final Production83_341 production = new Production83_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}