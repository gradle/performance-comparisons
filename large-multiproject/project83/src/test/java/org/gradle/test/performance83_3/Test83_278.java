package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_278 {
    private final Production83_278 production = new Production83_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}