package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_250 {
    private final Production80_250 production = new Production80_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}