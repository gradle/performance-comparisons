package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_318 {
    private final Production83_318 production = new Production83_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}