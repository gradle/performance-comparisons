package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_464 {
    private final Production83_464 production = new Production83_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}