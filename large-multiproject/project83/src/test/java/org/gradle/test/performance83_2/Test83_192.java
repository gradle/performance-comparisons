package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_192 {
    private final Production83_192 production = new Production83_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}