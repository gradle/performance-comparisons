package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_339 {
    private final Production83_339 production = new Production83_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}