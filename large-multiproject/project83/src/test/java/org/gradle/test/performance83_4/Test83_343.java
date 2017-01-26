package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_343 {
    private final Production83_343 production = new Production83_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}