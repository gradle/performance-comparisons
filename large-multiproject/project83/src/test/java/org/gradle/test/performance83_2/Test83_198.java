package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_198 {
    private final Production83_198 production = new Production83_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}