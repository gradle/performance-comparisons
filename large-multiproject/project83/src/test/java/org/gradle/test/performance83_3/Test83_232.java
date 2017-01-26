package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_232 {
    private final Production83_232 production = new Production83_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}