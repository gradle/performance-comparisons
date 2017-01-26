package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_308 {
    private final Production83_308 production = new Production83_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}