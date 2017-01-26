package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_177 {
    private final Production80_177 production = new Production80_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}