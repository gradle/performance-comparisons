package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_370 {
    private final Production80_370 production = new Production80_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}