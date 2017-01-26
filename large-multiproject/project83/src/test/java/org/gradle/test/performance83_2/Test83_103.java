package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_103 {
    private final Production83_103 production = new Production83_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}