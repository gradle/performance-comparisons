package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_232 {
    private final Production80_232 production = new Production80_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}