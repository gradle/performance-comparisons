package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_321 {
    private final Production80_321 production = new Production80_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}