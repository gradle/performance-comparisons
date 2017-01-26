package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_363 {
    private final Production80_363 production = new Production80_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}