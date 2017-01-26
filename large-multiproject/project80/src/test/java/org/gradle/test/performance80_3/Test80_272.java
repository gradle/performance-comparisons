package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_272 {
    private final Production80_272 production = new Production80_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}