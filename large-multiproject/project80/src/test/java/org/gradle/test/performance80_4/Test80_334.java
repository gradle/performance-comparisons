package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_334 {
    private final Production80_334 production = new Production80_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}