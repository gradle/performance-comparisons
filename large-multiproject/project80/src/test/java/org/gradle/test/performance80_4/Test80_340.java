package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_340 {
    private final Production80_340 production = new Production80_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}