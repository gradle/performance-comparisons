package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_158 {
    private final Production83_158 production = new Production83_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}