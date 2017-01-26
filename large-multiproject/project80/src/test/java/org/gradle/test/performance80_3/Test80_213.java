package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_213 {
    private final Production80_213 production = new Production80_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}