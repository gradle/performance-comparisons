package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_19 {
    private final Production83_19 production = new Production83_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}