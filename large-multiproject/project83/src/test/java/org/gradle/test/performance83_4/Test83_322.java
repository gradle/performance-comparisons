package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_322 {
    private final Production83_322 production = new Production83_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}