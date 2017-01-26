package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_105 {
    private final Production80_105 production = new Production80_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}