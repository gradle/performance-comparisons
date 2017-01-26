package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_184 {
    private final Production80_184 production = new Production80_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}