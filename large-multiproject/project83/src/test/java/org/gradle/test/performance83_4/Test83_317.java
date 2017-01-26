package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_317 {
    private final Production83_317 production = new Production83_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}