package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_343 {
    private final Production80_343 production = new Production80_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}