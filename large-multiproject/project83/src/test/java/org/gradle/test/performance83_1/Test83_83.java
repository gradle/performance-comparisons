package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_83 {
    private final Production83_83 production = new Production83_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}