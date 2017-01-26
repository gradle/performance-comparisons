package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_334 {
    private final Production83_334 production = new Production83_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}