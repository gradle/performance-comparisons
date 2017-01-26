package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_420 {
    private final Production80_420 production = new Production80_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}