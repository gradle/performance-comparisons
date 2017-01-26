package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_208 {
    private final Production83_208 production = new Production83_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}