package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_171 {
    private final Production83_171 production = new Production83_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}