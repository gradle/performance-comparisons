package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_374 {
    private final Production83_374 production = new Production83_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}