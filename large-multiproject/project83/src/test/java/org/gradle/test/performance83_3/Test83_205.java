package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_205 {
    private final Production83_205 production = new Production83_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}