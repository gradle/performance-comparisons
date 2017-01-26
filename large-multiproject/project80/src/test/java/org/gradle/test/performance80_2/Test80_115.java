package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_115 {
    private final Production80_115 production = new Production80_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}