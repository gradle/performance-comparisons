package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_301 {
    private final Production83_301 production = new Production83_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}