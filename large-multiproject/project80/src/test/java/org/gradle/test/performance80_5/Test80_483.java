package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_483 {
    private final Production80_483 production = new Production80_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}