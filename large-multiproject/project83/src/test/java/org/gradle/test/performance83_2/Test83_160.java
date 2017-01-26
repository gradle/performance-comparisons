package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_160 {
    private final Production83_160 production = new Production83_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}