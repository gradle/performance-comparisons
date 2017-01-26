package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_153 {
    private final Production83_153 production = new Production83_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}