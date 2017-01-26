package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_108 {
    private final Production83_108 production = new Production83_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}