package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_349 {
    private final Production80_349 production = new Production80_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}