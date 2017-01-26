package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_370 {
    private final Production83_370 production = new Production83_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}