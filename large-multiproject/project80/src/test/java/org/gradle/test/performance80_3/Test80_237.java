package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_237 {
    private final Production80_237 production = new Production80_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}