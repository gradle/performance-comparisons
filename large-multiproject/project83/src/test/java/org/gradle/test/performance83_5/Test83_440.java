package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_440 {
    private final Production83_440 production = new Production83_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}