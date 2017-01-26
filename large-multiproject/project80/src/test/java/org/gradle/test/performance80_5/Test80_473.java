package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_473 {
    private final Production80_473 production = new Production80_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}