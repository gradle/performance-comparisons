package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_30 {
    private final Production80_30 production = new Production80_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}