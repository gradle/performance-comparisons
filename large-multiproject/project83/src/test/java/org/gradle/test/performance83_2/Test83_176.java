package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_176 {
    private final Production83_176 production = new Production83_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}