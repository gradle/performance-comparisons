package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_32 {
    private final Production83_32 production = new Production83_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}