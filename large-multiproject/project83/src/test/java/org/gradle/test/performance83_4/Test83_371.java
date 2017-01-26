package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_371 {
    private final Production83_371 production = new Production83_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}