package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_94 {
    private final Production80_94 production = new Production80_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}