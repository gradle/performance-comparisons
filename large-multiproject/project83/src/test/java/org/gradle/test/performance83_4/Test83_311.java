package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_311 {
    private final Production83_311 production = new Production83_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}