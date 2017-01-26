package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_469 {
    private final Production83_469 production = new Production83_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}