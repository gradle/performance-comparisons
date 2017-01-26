package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_149 {
    private final Production80_149 production = new Production80_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}