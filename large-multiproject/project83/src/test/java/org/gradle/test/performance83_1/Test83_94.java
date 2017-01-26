package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_94 {
    private final Production83_94 production = new Production83_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}