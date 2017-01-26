package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_247 {
    private final Production83_247 production = new Production83_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}