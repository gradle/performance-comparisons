package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_360 {
    private final Production80_360 production = new Production80_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}