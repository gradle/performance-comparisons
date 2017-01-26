package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_431 {
    private final Production80_431 production = new Production80_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}