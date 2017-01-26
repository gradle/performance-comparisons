package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_387 {
    private final Production80_387 production = new Production80_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}