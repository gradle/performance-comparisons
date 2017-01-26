package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_142 {
    private final Production83_142 production = new Production83_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}