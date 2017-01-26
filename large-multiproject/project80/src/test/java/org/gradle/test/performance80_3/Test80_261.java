package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_261 {
    private final Production80_261 production = new Production80_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}