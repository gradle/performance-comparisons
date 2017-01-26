package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_252 {
    private final Production83_252 production = new Production83_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}