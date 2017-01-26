package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_244 {
    private final Production83_244 production = new Production83_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}