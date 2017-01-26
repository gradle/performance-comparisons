package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_153 {
    private final Production80_153 production = new Production80_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}