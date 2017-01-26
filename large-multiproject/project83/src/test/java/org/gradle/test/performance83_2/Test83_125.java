package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_125 {
    private final Production83_125 production = new Production83_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}