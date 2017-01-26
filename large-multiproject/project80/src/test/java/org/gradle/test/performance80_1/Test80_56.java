package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_56 {
    private final Production80_56 production = new Production80_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}