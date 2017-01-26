package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_304 {
    private final Production83_304 production = new Production83_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}