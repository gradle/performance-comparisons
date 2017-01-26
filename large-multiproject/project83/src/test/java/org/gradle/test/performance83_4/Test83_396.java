package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_396 {
    private final Production83_396 production = new Production83_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}