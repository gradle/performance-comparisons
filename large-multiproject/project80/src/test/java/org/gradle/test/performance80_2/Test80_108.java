package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_108 {
    private final Production80_108 production = new Production80_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}