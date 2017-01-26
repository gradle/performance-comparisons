package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_283 {
    private final Production80_283 production = new Production80_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}