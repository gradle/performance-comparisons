package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_271 {
    private final Production80_271 production = new Production80_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}