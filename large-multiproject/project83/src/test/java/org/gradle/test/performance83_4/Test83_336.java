package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_336 {
    private final Production83_336 production = new Production83_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}