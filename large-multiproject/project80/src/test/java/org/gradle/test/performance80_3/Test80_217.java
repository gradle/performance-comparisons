package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_217 {
    private final Production80_217 production = new Production80_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}