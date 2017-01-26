package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_218 {
    private final Production83_218 production = new Production83_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}