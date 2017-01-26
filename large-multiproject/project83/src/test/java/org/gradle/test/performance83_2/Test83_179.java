package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_179 {
    private final Production83_179 production = new Production83_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}