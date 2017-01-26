package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_298 {
    private final Production83_298 production = new Production83_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}