package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_86 {
    private final Production83_86 production = new Production83_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}