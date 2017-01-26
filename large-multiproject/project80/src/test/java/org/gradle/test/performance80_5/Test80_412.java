package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_412 {
    private final Production80_412 production = new Production80_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}