package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_184 {
    private final Production83_184 production = new Production83_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}