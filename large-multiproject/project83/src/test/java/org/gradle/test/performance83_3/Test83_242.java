package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_242 {
    private final Production83_242 production = new Production83_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}