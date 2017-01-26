package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_488 {
    private final Production80_488 production = new Production80_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}