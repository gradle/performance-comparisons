package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_477 {
    private final Production83_477 production = new Production83_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}