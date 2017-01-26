package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_30 {
    private final Production83_30 production = new Production83_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}