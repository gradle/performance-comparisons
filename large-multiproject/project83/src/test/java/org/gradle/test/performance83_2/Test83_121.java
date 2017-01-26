package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_121 {
    private final Production83_121 production = new Production83_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}