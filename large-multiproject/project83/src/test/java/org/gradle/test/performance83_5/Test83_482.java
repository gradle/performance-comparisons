package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_482 {
    private final Production83_482 production = new Production83_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}