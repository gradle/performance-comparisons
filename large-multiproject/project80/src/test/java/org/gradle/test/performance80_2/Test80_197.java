package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_197 {
    private final Production80_197 production = new Production80_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}