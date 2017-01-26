package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_113 {
    private final Production83_113 production = new Production83_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}