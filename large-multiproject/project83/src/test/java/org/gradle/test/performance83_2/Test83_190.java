package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_190 {
    private final Production83_190 production = new Production83_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}