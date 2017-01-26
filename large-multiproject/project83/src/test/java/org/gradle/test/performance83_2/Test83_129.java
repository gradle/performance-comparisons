package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_129 {
    private final Production83_129 production = new Production83_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}