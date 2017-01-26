package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_57 {
    private final Production80_57 production = new Production80_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}