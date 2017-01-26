package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_105 {
    private final Production83_105 production = new Production83_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}