package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_125 {
    private final Production80_125 production = new Production80_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}