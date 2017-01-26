package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_394 {
    private final Production80_394 production = new Production80_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}