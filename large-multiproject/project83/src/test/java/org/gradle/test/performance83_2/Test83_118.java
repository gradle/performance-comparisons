package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_118 {
    private final Production83_118 production = new Production83_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}