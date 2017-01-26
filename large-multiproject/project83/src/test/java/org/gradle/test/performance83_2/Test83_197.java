package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_197 {
    private final Production83_197 production = new Production83_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}