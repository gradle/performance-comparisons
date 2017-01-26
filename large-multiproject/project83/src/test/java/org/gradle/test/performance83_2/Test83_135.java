package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_135 {
    private final Production83_135 production = new Production83_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}