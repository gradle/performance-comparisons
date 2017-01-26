package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_256 {
    private final Production80_256 production = new Production80_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}