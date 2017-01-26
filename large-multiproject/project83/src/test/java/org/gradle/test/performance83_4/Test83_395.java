package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_395 {
    private final Production83_395 production = new Production83_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}