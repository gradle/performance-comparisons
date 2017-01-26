package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_178 {
    private final Production83_178 production = new Production83_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}