package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_396 {
    private final Production80_396 production = new Production80_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}