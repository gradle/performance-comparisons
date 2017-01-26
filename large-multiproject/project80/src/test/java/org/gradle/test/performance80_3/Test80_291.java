package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_291 {
    private final Production80_291 production = new Production80_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}