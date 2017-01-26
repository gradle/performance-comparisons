package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_149 {
    private final Production83_149 production = new Production83_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}