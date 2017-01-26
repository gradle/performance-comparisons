package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_421 {
    private final Production83_421 production = new Production83_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}