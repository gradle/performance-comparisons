package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_318 {
    private final Production80_318 production = new Production80_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}