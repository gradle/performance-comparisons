package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_201 {
    private final Production83_201 production = new Production83_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}