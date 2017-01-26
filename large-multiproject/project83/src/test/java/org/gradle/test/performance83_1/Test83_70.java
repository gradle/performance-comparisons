package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_70 {
    private final Production83_70 production = new Production83_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}