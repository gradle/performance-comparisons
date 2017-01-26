package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_348 {
    private final Production83_348 production = new Production83_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}