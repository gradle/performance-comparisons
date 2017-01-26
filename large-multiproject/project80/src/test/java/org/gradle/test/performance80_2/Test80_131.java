package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_131 {
    private final Production80_131 production = new Production80_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}