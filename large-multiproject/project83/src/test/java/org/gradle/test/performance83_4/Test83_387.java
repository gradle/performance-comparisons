package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_387 {
    private final Production83_387 production = new Production83_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}