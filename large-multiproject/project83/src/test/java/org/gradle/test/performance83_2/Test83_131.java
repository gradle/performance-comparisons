package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_131 {
    private final Production83_131 production = new Production83_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}