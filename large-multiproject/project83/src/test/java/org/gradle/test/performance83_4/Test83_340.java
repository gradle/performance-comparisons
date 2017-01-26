package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_340 {
    private final Production83_340 production = new Production83_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}