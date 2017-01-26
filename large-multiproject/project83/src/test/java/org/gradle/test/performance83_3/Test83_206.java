package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_206 {
    private final Production83_206 production = new Production83_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}