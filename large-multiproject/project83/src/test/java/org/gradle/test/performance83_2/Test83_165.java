package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_165 {
    private final Production83_165 production = new Production83_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}