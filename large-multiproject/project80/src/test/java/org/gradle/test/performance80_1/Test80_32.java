package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_32 {
    private final Production80_32 production = new Production80_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}