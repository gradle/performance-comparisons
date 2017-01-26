package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_177 {
    private final Production83_177 production = new Production83_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}