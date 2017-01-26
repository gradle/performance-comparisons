package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_148 {
    private final Production83_148 production = new Production83_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}