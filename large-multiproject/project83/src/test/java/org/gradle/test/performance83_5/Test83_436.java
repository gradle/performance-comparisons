package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_436 {
    private final Production83_436 production = new Production83_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}