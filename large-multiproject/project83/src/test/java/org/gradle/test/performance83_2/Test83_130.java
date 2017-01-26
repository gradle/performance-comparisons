package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_130 {
    private final Production83_130 production = new Production83_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}