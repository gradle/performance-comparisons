package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_394 {
    private final Production83_394 production = new Production83_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}