package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_170 {
    private final Production83_170 production = new Production83_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}