package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_129 {
    private final Production80_129 production = new Production80_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}