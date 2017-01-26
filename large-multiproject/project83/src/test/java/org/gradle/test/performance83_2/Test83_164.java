package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_164 {
    private final Production83_164 production = new Production83_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}